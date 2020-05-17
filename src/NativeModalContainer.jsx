import { Component, createElement } from "react";

import { Dimensions, Modal, View } from "react-native";

export class NativeModalContainer extends Component {
    state = {
        windowWidth: Dimensions.get("window").width,
        windowHeight: Dimensions.get("window").height
    };
    render() {
        const { content, modalVisible } = this.props;
        if (!modalVisible || modalVisible.status !== "available") {
            return null;
        }

        const style = {
            flexDirection: "row",
            flex: 1
        };
        return (
            <Modal visible={modalVisible.value} transparent={true}>
                <View style={style}>{content}</View>
            </Modal>
        );
    }

    handler = newDimensions => {
        // console.info(
        //     "NativeModalContainer dimension change handler, new width: " +
        //         newDimensions.window.width +
        //         ", height: " +
        //         newDimensions.window.height
        // );
        this.setState({
            windowHeight: newDimensions.window.height,
            windowWidth: newDimensions.window.width
        });
    };

    componentDidMount() {
        Dimensions.addEventListener("change", this.handler);
    }

    componentWillUnmount() {
        // Important to stop updating state after unmount
        Dimensions.removeEventListener("change", this.handler);
    }
}

import { Modal, View } from "react-native";
import { createElement } from "react";

export function NativeModalContainer(props) {
    const { modalVisible } = props;

    if (!modalVisible) {
        return null;
    }

    const modalVisibleValue = !!modalVisible.value;

    const style = {
        flexDirection: "row",
        flex: 1
    };
    return (
        <Modal
            visible={modalVisibleValue}
            transparent={true}
            style={{ flex: 1 }}
            testID={props.name}
            supportedOrientations={[
                "portrait",
                "portrait-upside-down",
                "landscape",
                "landscape-left",
                "landscape-right"
            ]}
        >
            <View style={style} testID={`${props.name}$content`}>
                {props.content}
            </View>
        </Modal>
    );
}

import { Modal, View } from "react-native";
import { createElement } from "react";

export function NativeModalContainer({ content, modalVisible }) {
    if (!modalVisible) {
        return null;
    }

    const style = {
        flexDirection: "row",
        flex: 1
    };
    return (
        <Modal
            visible={!!modalVisible.value}
            transparent={true}
            style={{ flex: 1 }}
            supportedOrientations={[
                "portrait",
                "portrait-upside-down",
                "landscape",
                "landscape-left",
                "landscape-right"
            ]}
        >
            <View style={style}>{content}</View>
        </Modal>
    );
}

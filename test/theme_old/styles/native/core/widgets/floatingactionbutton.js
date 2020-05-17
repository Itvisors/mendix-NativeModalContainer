import { shadeBlendConvert }                 from "../helpers/_functions/shadeblendconvert.js";
import { background, brand, contrast, font } from "../variables";

//
// DISCLAIMER:
// Do not change this file because it is core styling.
// Customizing core files will make updating Atlas much more difficult in the future.
// To customize any core styling, copy the part you want to customize to styles/native/app/ so the core styling is overwritten.
//

/* ==========================================================================
    Floating Action Button

    Default Class For Mendix Floating Action Button Widget
========================================================================== */

export const com_mendix_widget_native_floatingactionbutton_FloatingActionButton = {
    container: {
        margin: 30,
    },
    button: {
        size: 50,
        rippleColor: contrast.lowest,
        backgroundColor: brand.primary,
        shadowColor: shadeBlendConvert(-0.3, background.primary),
        shadowOpacity: 0.9,
        shadowRadius: 4,
        shadowOffset: {
            width: 0,
            height: 2,
        },
        elevation: 2,
    },
    buttonIcon: {
        size: font.sizeLarge,
        color: contrast.lowest,
    },
    secondaryButton: {
        size: 30,
        backgroundColor: background.secondary,
        shadowColor: shadeBlendConvert(-0.2, background.primary),
        shadowOpacity: 0.9,
        shadowRadius: 4,
        shadowOffset: {
            width: 0,
            height: 2,
        },
        elevation: 2,
    },
    secondaryButtonIcon: {
        size: font.sizeSmall,
        color: contrast.high,
    },
    secondaryButtonCaption: {},
    secondaryButtonCaptionContainer: {
        marginHorizontal: 5,
        shadowColor: shadeBlendConvert(-0.2, background.primary),
        shadowOpacity: 0.9,
        shadowRadius: 4,
        shadowOffset: {
            width: 0,
            height: 2,
        },
        elevation: 2,
    },
};

package com.zoser.app.powermote;

public class IRMessages
{
    // MISC
    public static IRMessage NEC_REPEAT;
    // Sony Speaker
    public static IRMessage HOME_SONY_SPEAKER_ON;

    // Sony HT
    public static IRMessage HOME_SONY_HT_ON;
    public static IRMessage HOME_SONY_HT_VOLUME_UP;
    public static IRMessage HOME_SONY_HT_VOLUME_DOWN;
    // HDMI SPLITTER
    public static IRMessage HDMI_SPLITTER_ON;
    public static IRMessage HDMI_SPLITTER_SET_1;
    public static IRMessage HDMI_SPLITTER_SET_2;
    public static IRMessage HDMI_SPLITTER_SET_3;
    public static IRMessage HDMI_SPLITTER_SET_4;
    public static IRMessage HDMI_SPLITTER_SET_5;

    // LG TV
    public static IRMessage HOME_LG_TV_ON;
    public static IRMessage HOME_LG_TV_VOLUME_UP;
    public static IRMessage HOME_LG_TV_VOLUME_DOWN;

    // Konka
    public static IRMessage KONKA_POWER;

    public static IRMessage KONKA_ATV;
    public static IRMessage KONKA_DTV;
    public static IRMessage KONKA_3D;
    public static IRMessage KONKA_HDMI;

    public static IRMessage KONKA_INPUT;
    public static IRMessage KONKA_SOUND;
    public static IRMessage KONKA_PICTURE;
    public static IRMessage KONKA_ZOOM;

    public static IRMessage KONKA_01;
    public static IRMessage KONKA_02;
    public static IRMessage KONKA_03;

    public static IRMessage KONKA_04;
    public static IRMessage KONKA_05;
    public static IRMessage KONKA_06;

    public static IRMessage KONKA_07;
    public static IRMessage KONKA_08;
    public static IRMessage KONKA_09;

    public static IRMessage KONKA_INFO;
    public static IRMessage KONKA_00;
    public static IRMessage KONKA_REC_DEC;

    public static IRMessage KONKA_FREEZE;
    public static IRMessage KONKA_EPS;
    public static IRMessage KONKA_MTS;
    public static IRMessage KONKA_MUTE;

    public static IRMessage KONKA_CHANNEL_UP;
    public static IRMessage KONKA_CHANNEL_DOWN;
    public static IRMessage KONKA_VOLUME_UP;
    public static IRMessage KONKA_VOLUME_DOWN;

    public static IRMessage KONKA_UP;

    public static IRMessage KONKA_LEFT;
    public static IRMessage KONKA_OK;
    public static IRMessage KONKA_RIGHT;

    public static IRMessage KONKA_MENU;
    public static IRMessage KONKA_DOWN;
    public static IRMessage KONKA_EXIT;

    public static IRMessage KONKA_RED;
    public static IRMessage KONKA_GREEN;
    public static IRMessage KONKA_YELLOW;
    public static IRMessage KONKA_BLUE;

    public static IRMessage KONKA_PLAY;
    public static IRMessage KONKA_STOP;
    public static IRMessage KONKA_FB;
    public static IRMessage KONKA_FF;

    public static IRMessage KONKA_PAUSE;
    public static IRMessage KONKA_REC;
    public static IRMessage KONKA_BACKWARD;
    public static IRMessage KONKA_FORWARD;

    public static IRMessage KONKA_INDEX;
    public static IRMessage KONKA_FAV;
    public static IRMessage KONKA_LIST;
    public static IRMessage KONKA_RADIO;

    public static IRMessage KONKA_AUDIO;
    public static IRMessage KONKA_10;
    public static IRMessage KONKA_11;



    public static void initialize()
    {
        // MISC
        NEC_REPEAT = IRNecFactory.createRepeat();

        // Sony Speaker
        HOME_SONY_SPEAKER_ON = IRSonyFactory.create(IRSonyFactory.TYPE_12_BITS,84,1,3);

        // Sony HT
        HOME_SONY_HT_ON      = IRSonyFactory.create(IRSonyFactory.TYPE_15_BITS,84,10,3);
        HOME_SONY_HT_VOLUME_UP = IRSonyFactory.create(IRSonyFactory.TYPE_15_BITS,36,10,3);
        HOME_SONY_HT_VOLUME_DOWN = IRSonyFactory.create(IRSonyFactory.TYPE_15_BITS,100,10,3);

        // LG TV
        HOME_LG_TV_ON           = IRNecFactory.create(16,32,2);
        HOME_LG_TV_VOLUME_UP    = IRNecFactory.create(64,32,2);
        HOME_LG_TV_VOLUME_DOWN  = IRNecFactory.create(192,32,2);

        //HDMI SPLITTER
        HDMI_SPLITTER_ON    = IRNecFactory.create(98,0,0);
        HDMI_SPLITTER_SET_1 = IRNecFactory.create(2,0,0);
        HDMI_SPLITTER_SET_2 = IRNecFactory.create(224,0,0);
        HDMI_SPLITTER_SET_3 = IRNecFactory.create(168,0,0);
        HDMI_SPLITTER_SET_4 = IRNecFactory.create(144,0,0);
        HDMI_SPLITTER_SET_5 = IRNecFactory.create(152,0,0);

        KONKA_00 = IRKonkaFactory.create(0x0200,0);
        KONKA_01 = IRKonkaFactory.create(0x0201,0);
        KONKA_02 = IRKonkaFactory.create(0x0202,0);
        KONKA_03 = IRKonkaFactory.create(0x0203,0);
        KONKA_04 = IRKonkaFactory.create(0x0204,0);
        KONKA_05 = IRKonkaFactory.create(0x0205,0);
        KONKA_06 = IRKonkaFactory.create(0x0206,0);
        KONKA_07 = IRKonkaFactory.create(0x0207,0);
        KONKA_08 = IRKonkaFactory.create(0x0208,0);
        KONKA_09 = IRKonkaFactory.create(0x0209,0);

        KONKA_INFO = IRKonkaFactory.create(0x020A,0);   // Program Information
        KONKA_POWER = IRKonkaFactory.create(0x020B,0);
        KONKA_YELLOW = IRKonkaFactory.create(0x020C,0);
        KONKA_SOUND = IRKonkaFactory.create(0x020D,0);
        KONKA_REC_DEC = IRKonkaFactory.create(0x020E,0);
        KONKA_FAV = IRKonkaFactory.create(0x020F,0);

        KONKA_CHANNEL_DOWN = IRKonkaFactory.create(0x0210,0);
        KONKA_CHANNEL_UP   = IRKonkaFactory.create(0x0211,0);
        KONKA_VOLUME_DOWN  = IRKonkaFactory.create(0x0212,0);
        KONKA_VOLUME_UP    = IRKonkaFactory.create(0x0213,0);

        KONKA_MUTE = IRKonkaFactory.create(0x0214,0);
        KONKA_MENU = IRKonkaFactory.create(0x0215,0);
        KONKA_BLUE = IRKonkaFactory.create(0x0216,0);
        KONKA_MTS = IRKonkaFactory.create(0x0217,0);  // Select Audio Channel
        KONKA_EPS = IRKonkaFactory.create(0x0218,0);
        KONKA_FREEZE = IRKonkaFactory.create(0x0219,0);

        KONKA_RED  = IRKonkaFactory.create(0x021A,0);   // @@@@@ NOT KNOWN @@@@@
        KONKA_LIST = IRKonkaFactory.create(0x021B,0);    // Channel List
        KONKA_INPUT = IRKonkaFactory.create(0x021C,0);
        KONKA_PICTURE = IRKonkaFactory.create(0x021D,0);  // Video Normal, Soft,
        KONKA_ZOOM = IRKonkaFactory.create(0x021E,0);   // 16:9, 4:3 ... ... No use for DTV
        KONKA_GREEN  = IRKonkaFactory.create(0x021F,0);   // @@@@@ NOT KNOWN @@@@@

        KONKA_INDEX = IRKonkaFactory.create(0x0220,0);
        KONKA_RADIO = IRKonkaFactory.create(0x0221,0);
        KONKA_FB = IRKonkaFactory.create(0x0222,0);
        KONKA_FF = IRKonkaFactory.create(0x0223,0);
        KONKA_BACKWARD = IRKonkaFactory.create(0x0224,0);
        KONKA_PLAY = IRKonkaFactory.create(0x0225,0);
        KONKA_PAUSE = IRKonkaFactory.create(0x0226,0);
        KONKA_REC = IRKonkaFactory.create(0x0227,0);
        KONKA_FORWARD = IRKonkaFactory.create(0x0228,0);
        // KONKA_ = IRKonkaFactory.create(0x0229,0);
        KONKA_STOP = IRKonkaFactory.create(0x022A,0);

        KONKA_UP = IRKonkaFactory.create(0x022B,0);
        KONKA_DOWN = IRKonkaFactory.create(0x022C,0);
        KONKA_LEFT = IRKonkaFactory.create(0x022D,0);
        KONKA_RIGHT = IRKonkaFactory.create(0x022E,0);
        KONKA_OK = IRKonkaFactory.create(0x022F,0);

        KONKA_EXIT = IRKonkaFactory.create(0x0230,0);
        KONKA_HDMI = IRKonkaFactory.create(0x0231,0);
        KONKA_ATV = IRKonkaFactory.create(0x0232,0);
        KONKA_DTV   = IRKonkaFactory.create(0x0233,0);
        KONKA_3D   = IRKonkaFactory.create(0x0234,0);

        // KONKA_10 = IRKonkaFactory.create(0x0236,0);
        // KONKA_11 = IRKonkaFactory.create(0x0237,0);

        // KONKA_HOME = IRKonkaFactory.create(0x0213,0);

    }
}

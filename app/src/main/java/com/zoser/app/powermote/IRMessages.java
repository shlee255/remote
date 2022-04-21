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
    public static IRMessage KONKA_CHANNEL_UP;
    public static IRMessage KONKA_CHANNEL_DOWN;
    public static IRMessage KONKA_VOLUME_UP;
    public static IRMessage KONKA_VOLUME_DOWN;

    public static IRMessage KONKA_3D;
    public static IRMessage KONKA_TV;
    public static IRMessage KONKA_HDMI;
    public static IRMessage KONKA_INFO;
    public static IRMessage KONKA_AUDIO;
    public static IRMessage KONKA_BLUE;
    public static IRMessage KONKA_EPS;
    public static IRMessage KONKA_OK;
    public static IRMessage KONKA_EXIT;
    public static IRMessage KONKA_MUTE;
    public static IRMessage KONKA_LEFT;
    public static IRMessage KONKA_RIGHT;
    public static IRMessage KONKA_UP;
    public static IRMessage KONKA_DOWN;
    public static IRMessage KONKA_POWER;
    public static IRMessage KONKA_INPUT;
    public static IRMessage KONKA_HOME;
    public static IRMessage KONKA_MENU;
    public static IRMessage KONKA_SOUND;
    public static IRMessage KONKA_STOP;

    public static IRMessage KONKA_00;
    public static IRMessage KONKA_01;
    public static IRMessage KONKA_02;
    public static IRMessage KONKA_03;
    public static IRMessage KONKA_04;
    public static IRMessage KONKA_05;
    public static IRMessage KONKA_06;
    public static IRMessage KONKA_07;
    public static IRMessage KONKA_08;
    public static IRMessage KONKA_09;
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

        KONKA_CHANNEL_DOWN = IRKonkaFactory.create(0x0210,0);
        KONKA_CHANNEL_UP   = IRKonkaFactory.create(0x0211,0);
        KONKA_VOLUME_DOWN  = IRKonkaFactory.create(0x0212,0);
        KONKA_VOLUME_UP    = IRKonkaFactory.create(0x0213,0);

        KONKA_MUTE = IRKonkaFactory.create(0x0214,0);
        KONKA_MENU = IRKonkaFactory.create(0x0215,0);
        KONKA_BLUE = IRKonkaFactory.create(0x0216,0);
        KONKA_AUDIO = IRKonkaFactory.create(0x0217,0);  // Select Audio Channel
        KONKA_EPS = IRKonkaFactory.create(0x0218,0);
        KONKA_STOP = IRKonkaFactory.create(0x0219,0);

        // KONKA_  = IRKonkaFactory.create(0x021A,0);   // @@@@@ NOT KNOWN @@@@@
        // KONKA_LIST = IRKonkaFactory.create(0x021B,0);    // Channel List
        KONKA_INPUT = IRKonkaFactory.create(0x021C,0);
        // KONKA_VIDEO = IRKonkaFactory.create(0x021D,0);  // Video Normal, Soft,
        // KONKA_SCALE = IRKonkaFactory.create(0x021E,0);   // 16:9, 4:3 ... ... No use for DTV
        // KONKA_  = IRKonkaFactory.create(0x021F,0);   // @@@@@ NOT KNOWN @@@@@

        KONKA_UP = IRKonkaFactory.create(0x022B,0);
        KONKA_DOWN = IRKonkaFactory.create(0x022C,0);
        KONKA_LEFT = IRKonkaFactory.create(0x022D,0);
        KONKA_RIGHT = IRKonkaFactory.create(0x022E,0);
        KONKA_OK = IRKonkaFactory.create(0x022F,0);

        KONKA_INFO = IRKonkaFactory.create(0x020A,0);   // Program Information
        KONKA_POWER = IRKonkaFactory.create(0x020B,0);
        KONKA_SOUND = IRKonkaFactory.create(0x020D,0);

        //KONKA_FAV = IRKonkaFactory.create(0x020D,0);

        KONKA_EXIT = IRKonkaFactory.create(0x0230,0);
        KONKA_HDMI = IRKonkaFactory.create(0x0231,0);
        // KONKA_HDMI = IRKonkaFactory.create(0x0232,0);
        KONKA_TV   = IRKonkaFactory.create(0x0233,0);
        KONKA_3D   = IRKonkaFactory.create(0x0234,0);

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


        KONKA_10 = IRKonkaFactory.create(0x0236,0);
        KONKA_11 = IRKonkaFactory.create(0x0237,0);

        KONKA_HOME = IRKonkaFactory.create(0x0213,0);

    }
}

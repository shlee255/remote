package com.zoser.app.powermote;

import java.util.ArrayList;
import java.util.List;

public class IRKonkaFactory
{
    public static final int HDR_MARK  = 3000;
    public static final int HDR_SPACE = 3000;

    public static final int MARK        = 500;
    public static final int ONE_SPACE   = 2500;
    public static final int ZERO_SPACE  = 1500;

    public static final int SPACE_END1 = 4000;
    public static final int SPACE_END2 = 233000;

    public static IRMessage create(int command, int repeats)
    {
        List<Integer> tempMessage = new ArrayList<>();
        List<Integer> outMessage = new ArrayList<>();

        tempMessage.add(HDR_MARK);
        tempMessage.add(HDR_SPACE);

        List<Integer> cmdPulses = decodeInt(command,16);

        tempMessage.addAll(cmdPulses);

        tempMessage.add(MARK);
        tempMessage.add(SPACE_END1);
        tempMessage.add(MARK);
        tempMessage.add(SPACE_END2);

        for(int i = 0; i <= repeats; i++)
        {
            for(int a = 0; a < tempMessage.size(); ++a)
            {
                outMessage.add(tempMessage.get(a).intValue());
            }
        }

        int [] finalCode = new int[outMessage.size()];

        for(int a=0;a<outMessage.size();++a)
        {
            finalCode[a] = outMessage.get(a).intValue();
        }

        return new IRMessage(IRMessage.FREQ_38_KHZ,finalCode);
    }

    private static List<Integer> decodeInt(int num, int bits)
    {
        List<Integer> values = new ArrayList<>();
        for (int i = bits - 1; i >= 0; i--)
        {
            values.add(MARK);
            values.add(((num & (1 << i)) == 0)?ZERO_SPACE:ONE_SPACE);
        }
        return values;
    }
}

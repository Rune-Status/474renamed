/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.Socket;


public class RSSocket implements Runnable {
    public static int anInt461;
    public static int anInt464;
    public static int anInt465;
    public static int anInt467;
    public static int anInt469;
    public static JString aJString_471 = Class37_Sub2.method332((byte) 114,
            " <col=ffff00>");
    public static Class37_Sub16 aClass37_Sub16_472 = new Class37_Sub16(0, 0);
    public static int anInt473;
    public static boolean aBoolean474;
    public static int anInt476;
    public static int anInt477;
    public static int anInt478;
    public static JString aJString_480 = Class37_Sub2.method332((byte) 110,
            "m-Ochte mit Ihnen handeln)3");
    public static Class58 aClass58_481;
    public static int anInt482;
    public static int anInt483;
    public static boolean[] aBooleanArray484 = new boolean[112];
    public static int anInt487;
    public static JString aJString_488;
    public static Class73 aClass73_489;
    public static int anInt490;
    public static Class18 aClass18_491;

    /*synthetic*/ public static Class aClass492;

    /*synthetic*/ public static Class aClass493;

    /*synthetic*/ public static Class aClass494;

    /*synthetic*/ public static Class aClass495;

    /*synthetic*/ public static Class aClass496;

    /*synthetic*/ public static Class aClass497;

    /*synthetic*/ public static Class aClass498;

    /*synthetic*/ public static Class aClass499;

    /*synthetic*/ public static Class aClass500;

    /*synthetic*/ public static Class aClass501;

    /*synthetic*/ public static Class aClass502;

    /*synthetic*/ public static Class aClass503;

    /*synthetic*/ public static Class aClass504;

    /*synthetic*/ public static Class aClass505;

    /*synthetic*/ public static Class aClass506;

    /*synthetic*/ public static Class aClass507;

    /*synthetic*/ public static Class aClass508;

    /*synthetic*/ public static Class aClass509;

    /*synthetic*/ public static Class aClass510;

    /*synthetic*/ public static Class aClass511;

    /*synthetic*/ public static Class aClass512;

    /*synthetic*/ public static Class aClass513;

    /*synthetic*/ public static Class aClass514;

    /*synthetic*/ public static Class aClass515;

    /*synthetic*/ public static Class aClass516;

    /*synthetic*/ public static Class aClass517;

    /*synthetic*/ public static Class aClass518;

    /*synthetic*/ public static Class aClass519;

    /*synthetic*/ public static Class aClass520;

    /*synthetic*/ public static Class aClass521;

    /*synthetic*/ public static Class aClass522;

    /*synthetic*/ public static Class aClass523;

    /*synthetic*/ public static Class aClass524;

    /*synthetic*/ public static Class aClass525;

    /*synthetic*/ public static Class aClass526;

    /*synthetic*/ public static Class aClass527;

    /*synthetic*/ public static Class aClass528;

    static {
        aClass58_481 = new Class58();
        anInt487 = 0;
        aJString_488 = Class37_Sub2.method332((byte) 114, "http:)4)4");
        anInt490 = 0;
    }

    public byte[] buffer;
    public OutputStream outputStream;
    public int writeOffset = 0; //I'm honestly not 100% sure what this is, but it's used as the offset variable in the outputStream.write method
    public InputStream inputStream;
    public Signlink signlink;
    public Socket underlyingSocket;
    public boolean threadDead = false;
    public int bufferLocation = 0;
    public boolean close = false;
    public Resource activeThread;

    public RSSocket(Socket socket, Signlink class51) throws IOException {
        try {
            underlyingSocket = socket;
            signlink = class51;
            underlyingSocket.setSoTimeout(30000);
            underlyingSocket.setTcpNoDelay(true);
            inputStream = underlyingSocket.getInputStream();
            outputStream = underlyingSocket.getOutputStream();
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("fd.<init>(" + ((socket != null) ? "{...}" : "null") + ',' +
                ((class51 != null) ? "{...}" : "null") + ')'));
        }
    }

    public static boolean withinRange(int i, int i_0_) {
        anInt461++;

        if (i_0_ != 65) {
            aBoolean474 = true;
        }

        if (((i < 97) || (i > 122)) && ((i < 65) || ((i ^ 0xffffffff) < -91))) {
            return false;
        }

        return true;
    }

    public static Class classFromInt(int i, boolean bool) {
        anInt477++;

        if (bool != false) {
            return null;
        }

        int i_1_ = i;
while_53_: 
        do {
while_52_: 
            do {
while_51_: 
                do {
while_50_: 
                    do {
while_49_: 
                        do {
while_48_: 
                            do {
while_47_: 
                                do {
while_46_: 
                                    do {
while_45_: 
                                        do {
while_44_: 
                                            do {
while_43_: 
                                                do {
while_42_: 
                                                    do {
while_41_: 
                                                        do {
while_40_: 
                                                            do {
while_39_: 
                                                                do {
while_38_: 
                                                                    do {
while_37_: 
                                                                        do {
while_36_: 
                                                                            do {
while_35_: 
                                                                                do {
while_34_: 
                                                                                    do {
while_33_: 
                                                                                        do {
while_32_: 
                                                                                            do {
while_31_: 
                                                                                                do {
while_30_: 
                                                                                                    do {
while_29_: 
                                                                                                        do {
while_28_: 
                                                                                                            do {
while_27_: 
                                                                                                                do {
while_26_: 
                                                                                                                    do {
while_25_: 
                                                                                                                        do {
while_24_: 
                                                                                                                            do {
while_23_: 
                                                                                                                                do {
while_22_: 
                                                                                                                                    do {
while_21_: 
                                                                                                                                        do {
while_20_: 
                                                                                                                                            do {
while_19_: 
                                                                                                                                                do {
                                                                                                                                                    do {
                                                                                                                                                        if ((i_1_ ^
                                                                                                                                                                0xffffffff) != -1) {
                                                                                                                                                            if (i_1_ != 1) {
                                                                                                                                                                if ((i_1_ ^
                                                                                                                                                                        0xffffffff) != -3) {
                                                                                                                                                                    if (i_1_ != 3) {
                                                                                                                                                                        if (i_1_ != 4) {
                                                                                                                                                                            if (i_1_ != 5) {
                                                                                                                                                                                if (i_1_ != 6) {
                                                                                                                                                                                    if (i_1_ != 7) {
                                                                                                                                                                                        if ((i_1_ ^
                                                                                                                                                                                                0xffffffff) != -9) {
                                                                                                                                                                                            if (i_1_ != 9) {
                                                                                                                                                                                                if ((i_1_ ^
                                                                                                                                                                                                        0xffffffff) != -11) {
                                                                                                                                                                                                    if ((i_1_ ^
                                                                                                                                                                                                            0xffffffff) != -12) {
                                                                                                                                                                                                        if ((i_1_ ^
                                                                                                                                                                                                                0xffffffff) != -13) {
                                                                                                                                                                                                            if ((i_1_ ^
                                                                                                                                                                                                                    0xffffffff) != -14) {
                                                                                                                                                                                                                if ((i_1_ ^
                                                                                                                                                                                                                        0xffffffff) != -15) {
                                                                                                                                                                                                                    if (i_1_ != 15) {
                                                                                                                                                                                                                        if (i_1_ != 16) {
                                                                                                                                                                                                                            if (i_1_ != 17) {
                                                                                                                                                                                                                                if ((i_1_ ^
                                                                                                                                                                                                                                        0xffffffff) != -20) {
                                                                                                                                                                                                                                    if (i_1_ != 20) {
                                                                                                                                                                                                                                        if ((i_1_ ^
                                                                                                                                                                                                                                                0xffffffff) != -22) {
                                                                                                                                                                                                                                            if ((i_1_ ^
                                                                                                                                                                                                                                                    0xffffffff) != -23) {
                                                                                                                                                                                                                                                if (i_1_ != 23) {
                                                                                                                                                                                                                                                    if ((i_1_ ^
                                                                                                                                                                                                                                                            0xffffffff) != -25) {
                                                                                                                                                                                                                                                        if (i_1_ != 25) {
                                                                                                                                                                                                                                                            if (i_1_ != 26) {
                                                                                                                                                                                                                                                                if ((i_1_ ^
                                                                                                                                                                                                                                                                        0xffffffff) != -28) {
                                                                                                                                                                                                                                                                    if (i_1_ != 30) {
                                                                                                                                                                                                                                                                        if (i_1_ != 31) {
                                                                                                                                                                                                                                                                            if (i_1_ != 32) {
                                                                                                                                                                                                                                                                                if ((i_1_ ^
                                                                                                                                                                                                                                                                                        0xffffffff) != -34) {
                                                                                                                                                                                                                                                                                    if ((i_1_ ^
                                                                                                                                                                                                                                                                                            0xffffffff) != -35) {
                                                                                                                                                                                                                                                                                        if ((i_1_ ^
                                                                                                                                                                                                                                                                                                0xffffffff) != -36) {
                                                                                                                                                                                                                                                                                            if (i_1_ != 36) {
                                                                                                                                                                                                                                                                                                if (i_1_ != 37) {
                                                                                                                                                                                                                                                                                                    if (i_1_ != 38) {
                                                                                                                                                                                                                                                                                                        if ((i_1_ ^
                                                                                                                                                                                                                                                                                                                0xffffffff) == -40) {
                                                                                                                                                                                                                                                                                                            break while_52_;
                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                        break while_53_;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                    break while_50_;
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                break while_51_;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                            break while_48_;
                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                        break while_49_;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                    break while_46_;
                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                break while_47_;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            break while_44_;
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                        break while_45_;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    break while_42_;
                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                break while_43_;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            break while_40_;
                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                        break while_41_;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    break while_38_;
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                break while_39_;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            break while_36_;
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                        break while_37_;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    break while_34_;
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                break while_35_;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            break while_32_;
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                        break while_33_;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    break while_30_;
                                                                                                                                                                                                                }

                                                                                                                                                                                                                break while_31_;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            break while_28_;
                                                                                                                                                                                                        }

                                                                                                                                                                                                        break while_29_;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    break while_26_;
                                                                                                                                                                                                }

                                                                                                                                                                                                break while_27_;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            break while_24_;
                                                                                                                                                                                        }

                                                                                                                                                                                        break while_25_;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    break while_22_;
                                                                                                                                                                                }

                                                                                                                                                                                break while_23_;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            break while_20_;
                                                                                                                                                                        }

                                                                                                                                                                        break while_21_;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    break;
                                                                                                                                                                }

                                                                                                                                                                break while_19_;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            if (aClass492 != null) {
                                                                                                                                                                return aClass492;
                                                                                                                                                            }

                                                                                                                                                            return aClass492 = classFromName(
                                                                                                                                                                    "Class37_Sub9_Sub14");
                                                                                                                                                        }

                                                                                                                                                        if (aClass493 != null) {
                                                                                                                                                            return aClass493;
                                                                                                                                                        }

                                                                                                                                                        return aClass493 = classFromName(
                                                                                                                                                                "Class37_Sub9_Sub7");
                                                                                                                                                    } while (false);

                                                                                                                                                    if (aClass494 != null) {
                                                                                                                                                        return aClass494;
                                                                                                                                                    }

                                                                                                                                                    return aClass494 = classFromName(
                                                                                                                                                            "Class37_Sub9_Sub25");
                                                                                                                                                } while (false);

                                                                                                                                                if (aClass495 != null) {
                                                                                                                                                    return aClass495;
                                                                                                                                                }

                                                                                                                                                return aClass495 = classFromName(
                                                                                                                                                        "Class37_Sub9_Sub35");
                                                                                                                                            } while (false);

                                                                                                                                            if (aClass496 != null) {
                                                                                                                                                return aClass496;
                                                                                                                                            }

                                                                                                                                            return aClass496 = classFromName(
                                                                                                                                                    "Class37_Sub9_Sub4");
                                                                                                                                        } while (false);

                                                                                                                                        if (aClass497 != null) {
                                                                                                                                            return aClass497;
                                                                                                                                        }

                                                                                                                                        return aClass497 = classFromName(
                                                                                                                                                "Class37_Sub9_Sub18");
                                                                                                                                    } while (false);

                                                                                                                                    if (aClass498 != null) {
                                                                                                                                        return aClass498;
                                                                                                                                    }

                                                                                                                                    return aClass498 = classFromName(
                                                                                                                                            "Class37_Sub9_Sub31");
                                                                                                                                } while (false);

                                                                                                                                if (aClass499 != null) {
                                                                                                                                    return aClass499;
                                                                                                                                }

                                                                                                                                return aClass499 = classFromName(
                                                                                                                                        "Class37_Sub9_Sub29");
                                                                                                                            } while (false);

                                                                                                                            if (aClass500 != null) {
                                                                                                                                return aClass500;
                                                                                                                            }

                                                                                                                            return aClass500 = classFromName(
                                                                                                                                    "Class37_Sub9_Sub15");
                                                                                                                        } while (false);

                                                                                                                        if (aClass501 != null) {
                                                                                                                            return aClass501;
                                                                                                                        }

                                                                                                                        return aClass501 = classFromName(
                                                                                                                                "Class37_Sub9_Sub27");
                                                                                                                    } while (false);

                                                                                                                    if (aClass502 != null) {
                                                                                                                        return aClass502;
                                                                                                                    }

                                                                                                                    return aClass502 = classFromName(
                                                                                                                            "Class37_Sub9_Sub13");
                                                                                                                } while (false);

                                                                                                                if (aClass503 != null) {
                                                                                                                    return aClass503;
                                                                                                                }

                                                                                                                return aClass503 = classFromName(
                                                                                                                        "Class37_Sub9_Sub28");
                                                                                                            } while (false);

                                                                                                            if (aClass504 != null) {
                                                                                                                return aClass504;
                                                                                                            }

                                                                                                            return aClass504 = classFromName(
                                                                                                                    "Class37_Sub9_Sub11");
                                                                                                        } while (false);

                                                                                                        if (aClass505 != null) {
                                                                                                            return aClass505;
                                                                                                        }

                                                                                                        return aClass505 = classFromName(
                                                                                                                "Class37_Sub9_Sub33");
                                                                                                    } while (false);

                                                                                                    if (aClass506 != null) {
                                                                                                        return aClass506;
                                                                                                    }

                                                                                                    return aClass506 = classFromName(
                                                                                                            "Class37_Sub9_Sub19");
                                                                                                } while (false);

                                                                                                if (aClass507 != null) {
                                                                                                    return aClass507;
                                                                                                }

                                                                                                return aClass507 = classFromName(
                                                                                                        "Class37_Sub9_Sub34");
                                                                                            } while (false);

                                                                                            if (aClass508 != null) {
                                                                                                return aClass508;
                                                                                            }

                                                                                            return aClass508 = classFromName(
                                                                                                    "Class37_Sub9_Sub24");
                                                                                        } while (false);

                                                                                        if (aClass509 != null) {
                                                                                            return aClass509;
                                                                                        }

                                                                                        return aClass509 = classFromName(
                                                                                                "Class37_Sub9_Sub20");
                                                                                    } while (false);

                                                                                    if (aClass510 != null) {
                                                                                        return aClass510;
                                                                                    }

                                                                                    return aClass510 = classFromName(
                                                                                            "Class37_Sub9_Sub10");
                                                                                } while (false);

                                                                                if (aClass511 != null) {
                                                                                    return aClass511;
                                                                                }

                                                                                return aClass511 = classFromName(
                                                                                        "Class37_Sub9_Sub9");
                                                                            } while (false);

                                                                            if (aClass512 != null) {
                                                                                return aClass512;
                                                                            }

                                                                            return aClass512 = classFromName(
                                                                                    "Class37_Sub9_Sub1");
                                                                        } while (false);

                                                                        if (aClass513 != null) {
                                                                            return aClass513;
                                                                        }

                                                                        return aClass513 = classFromName(
                                                                                "Class37_Sub9_Sub26");
                                                                    } while (false);

                                                                    if (aClass514 != null) {
                                                                        return aClass514;
                                                                    }

                                                                    return (aClass514 = classFromName(
                                                                            "Class37_Sub9_Sub32"));
                                                                } while (false);

                                                                if (aClass515 != null) {
                                                                    return aClass515;
                                                                }

                                                                return (aClass515 = (classFromName(
                                                                        "Class37_Sub9_Sub22")));
                                                            } while (false);

                                                            if (aClass516 != null) {
                                                                return aClass516;
                                                            }

                                                            return (aClass516 = (classFromName(
                                                                    "Class37_Sub9_Sub17")));
                                                        } while (false);

                                                        if (aClass517 != null) {
                                                            return aClass517;
                                                        }

                                                        return (aClass517 = (classFromName(
                                                                "Class37_Sub9_Sub36")));
                                                    } while (false);

                                                    if (aClass518 != null) {
                                                        return aClass518;
                                                    }

                                                    return (aClass518 = (classFromName(
                                                            "Class37_Sub9_Sub8")));
                                                } while (false);

                                                if (aClass519 != null) {
                                                    return aClass519;
                                                }

                                                return (aClass519 = (classFromName(
                                                        "Class37_Sub9_Sub5")));
                                            } while (false);

                                            if (aClass520 != null) {
                                                return aClass520;
                                            }

                                            return (aClass520 = (classFromName(
                                                    "Class37_Sub9_Sub3")));
                                        } while (false);

                                        if (aClass521 != null) {
                                            return aClass521;
                                        }

                                        return (aClass521 = (classFromName(
                                                "Class37_Sub9_Sub6")));
                                    } while (false);

                                    if (aClass522 != null) {
                                        return aClass522;
                                    }

                                    return (aClass522 = classFromName(
                                            "Class37_Sub9_Sub2"));
                                } while (false);

                                if (aClass523 != null) {
                                    return aClass523;
                                }

                                return (aClass523 = classFromName(
                                        "Class37_Sub9_Sub16"));
                            } while (false);

                            if (aClass524 != null) {
                                return aClass524;
                            }

                            return aClass524 = classFromName("Class37_Sub9_Sub23");
                        } while (false);

                        if (aClass525 != null) {
                            return aClass525;
                        }

                        return aClass525 = classFromName("Class37_Sub9_Sub37");
                    } while (false);

                    if (aClass526 != null) {
                        return aClass526;
                    }

                    return aClass526 = classFromName("Class37_Sub9_Sub30");
                } while (false);

                if (aClass527 != null) {
                    return aClass527;
                }

                return aClass527 = classFromName("Class37_Sub9_Sub12");
            } while (false);

            if (aClass528 != null) {
                return aClass528;
            }

            return aClass528 = classFromName("Class37_Sub9_Sub21");
        } while (false);

        return null;
    }

    public void run() {
        anInt464++;

        try {
            for (;;) {
                int i;
                int i_2_;

                synchronized (this) {
                    if (bufferLocation == writeOffset) {
                        if (threadDead) {
                            break;
                        }

                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }

                    i = writeOffset;

                    if (writeOffset <= bufferLocation) {
                        i_2_ = -writeOffset + bufferLocation;
                    } else {
                        i_2_ = -writeOffset + 5000;
                    }
                }

                if (i_2_ > 0) {
                    try {
                        outputStream.write(buffer, i, i_2_);
                    } catch (IOException ioexception) {
                        close = true;
                    }

                    writeOffset = (i_2_ + writeOffset) % 5000;

                    try {
                        if (bufferLocation == writeOffset) {
                            outputStream.flush();
                        }
                    } catch (IOException ioexception) {
                        close = true;
                    }
                }
            }

            try {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }

                if (underlyingSocket != null) {
                    underlyingSocket.close();
                }
            } catch (IOException ioexception) {
                /* empty */
            }

            buffer = null;
        } catch (Exception exception) {
            Class37_Sub9_Sub3.method768(-92, null, exception);
        }
    }

    public void write(int offset, byte dummy, byte[] bytes, int length)
        throws IOException {
        if (dummy < 95) {
            anInt490 = -56;
        }

        anInt467++;

        if (!threadDead) {
            if (close) {
                close = false;
                throw new IOException();
            }

            if (buffer == null) {
                buffer = new byte[5000];
            }

            synchronized (this) {
                for (int i_5_ = 0; i_5_ < length; i_5_++) {
                    buffer[bufferLocation] = bytes[offset + i_5_];
                    bufferLocation = (bufferLocation + 1) % 5000;

                    if (bufferLocation == ((4900 + writeOffset) % 5000)) {
                        throw new IOException();
                    }
                }

                if (activeThread == null) {
                    activeThread = signlink.createResourceThread(this, 3, (byte) 65);
                }

                this.notifyAll();
            }
        }
    }

    public int read(boolean dummy) throws IOException {
        anInt469++;

        if (threadDead) {
            return 0;
        }

        if (dummy != false) {
            aClass73_489 = null;
        }

        return inputStream.read();
    }

    //I didn't name this method
    public void finalize() {
        killThread((byte) -128);
        anInt465++;
    }

    public int available(int dummy) throws IOException {
        anInt482++;

        if (dummy > -104) {
            finalize();
        }

        if (threadDead) {
            return 0;
        }
        return inputStream.available();
    }

    public static void resetStaticVariables(int i) {
        aBooleanArray484 = null;

        if (i == -3) {
            aJString_480 = null;
            aJString_471 = null;
            aClass58_481 = null;
            aJString_488 = null;
            aClass37_Sub16_472 = null;
            aClass18_491 = null;
            aClass73_489 = null;
        }
    }

	public void read(int length, int offset, int dummy, byte[] dest)
			throws IOException {
		anInt476++;

		if (dummy != 122) {
			resetStaticVariables(126);
		}

		if (!threadDead) {
			while (length > 0) {

				int i_8_ = inputStream.read(dest, offset, length);

				if (i_8_ <= 0) {
					throw new EOFException();
				}
				try {
					// throw new Exception("tracking");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				length -= i_8_;
				offset += i_8_;
			}
		}
	}

    //Not entirely sure the naming on threadDead and killThread is right.
    public void killThread(byte dummy) {
        if (dummy < -127) {
            anInt478++;

            if (!threadDead) {
                synchronized (this) {
                    threadDead = true;
                    this.notifyAll();
                }

                if (activeThread != null) {
                    while (activeThread.state == 0)
                        Class37_Sub9_Sub20.method846(1L, (byte) 58);

                    if (activeThread.state == 1) {
                        try {
                            ((Thread) activeThread.resource).join();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                }

                activeThread = null;
            }
        }
    }

    /*synthetic*/ public static Class classFromName(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}

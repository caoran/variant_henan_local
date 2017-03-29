package com.boco.soap.variant.common;

public class NumplanConvert {

    /**
     *E164码转换为E214码
     *
     * @param number E164码数字
     * @return E214码数字
     */
    public static String E164ToE214(String number) {
        String strMgt = "";
        if (number.equals("")) {
            return strMgt;
        }

        if (!number.startsWith("861")) {
            return String.format("不支持转换的E164号码{0}，请检查标准数据", number);
        }

        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(3, 2))
        // ORIGINAL LINE: case "78":
        else if (number.substring(3, 5).equals("78")) {
            strMgt = "861575" + number.substring(5);
        }
        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(3, 2))
        // ORIGINAL LINE: case "72":
        else if (number.substring(3, 5).equals("72")) {
            strMgt = "861572" + number.substring(5);
        }
        // ORIGINAL LINE: case "70":
        else if (number.substring(3, 5).equals("70")) // 861705XXX
        {
            if (number.substring(5, 6).equals("5")) {
                strMgt = "8615705" + number.substring(6);
            } else {
                strMgt = "861570" + number.substring(5);
            }
        }
        // ORIGINAL LINE: case "84":
        else if (number.substring(3, 5).equals("84")) {
            strMgt = "861384" + number.substring(5);
        }
        // ORIGINAL LINE: case "83":
        else if (number.substring(3, 5).equals("83")) {
            strMgt = "861385" + number.substring(5);
        }
        // ORIGINAL LINE: case "82":
        else if (number.substring(3, 5).equals("82")) {
            strMgt = "861386" + number.substring(5);
        }
        // ORIGINAL LINE: case "50":
        else if (number.substring(3, 5).equals("50")) {
            strMgt = "861383" + number.substring(5);
        }
        // ORIGINAL LINE: case "57":
        else if (number.substring(3, 5).equals("57") || number.substring(3, 5).equals("88")) {
            strMgt = "86157" + number.substring(4);
        }
        // ORIGINAL LINE: case "47":
        else if (number.substring(3, 5).equals("47")) {
            strMgt = "861579" + number.substring(5);
        }
        // ORIGINAL LINE: case "51":
        else if (number.substring(3, 5).equals("51") || number.substring(3, 5).equals("52") || number.substring(3, 5).equals("58")
                || number.substring(3, 5).equals("59") || number.substring(3, 5).equals("87")) {
            strMgt = "86138" + number.substring(4);
        }
        // ORIGINAL LINE: case "34":
        else if (number.substring(3, 5).equals("34")) {
            strMgt = "861380" + number.substring(5);
        }
        // ORIGINAL LINE: case "35":
        else if (number.substring(3, 5).equals("35") || number.substring(3, 5).equals("36") || number.substring(3, 5).equals("37")
                || number.substring(3, 5).equals("38") || number.substring(3, 5).equals("39")) {
            if (number.substring(5, 6).equals("0")) {
                if (number.length() > 9) {
                    strMgt = "86139" + number.substring(6, 9) + number.substring(4, 5) + number.substring(9);
                } else {
                    strMgt = "86139" + number.substring(6, 9) + number.substring(4, 5);
                }
            } else {
                if (number.length() > 9) {
                    strMgt = "86139" + number.substring(6, 9) + (Integer.parseInt(number.substring(4, 5)) - 5) + number.substring(5, 6)
                            + number.substring(9);
                } else {
                    strMgt = "86139" + number.substring(6, 9) + (Integer.parseInt(number.substring(4, 5)) - 5) + number.substring(5, 6);
                }
            }
        }
        // ORIGINAL LINE: case "30":
        else if (number.substring(3, 5).equals("30")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "0";
        }
        // ORIGINAL LINE: case "31":
        else if (number.substring(3, 5).equals("31")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "9";
        }
        // ORIGINAL LINE: case "32":
        else if (number.substring(3, 5).equals("32")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "2";
        }
        // ORIGINAL LINE: case "45":
        else if (number.substring(3, 5).equals("45")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "7";
        }
        // ORIGINAL LINE: case "55":
        else if (number.substring(3, 5).equals("55")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "4";
        }
        // ORIGINAL LINE: case "56":
        else if (number.substring(3, 5).equals("56")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "3";
        }
        // ORIGINAL LINE: case "76":
        else if (number.substring(3, 5).equals("76")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "1";
        }
        // ORIGINAL LINE: case "85":
        else if (number.substring(3, 5).equals("85")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "5";
        }
        // ORIGINAL LINE: case "86":
        else if (number.substring(3, 5).equals("86")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "6";
        } else {
            strMgt = "E164:" + number + "无法转换为相应的E214号段";
        }
        return strMgt;
    }

    public static String E214ToE164(String number) {
        String strHgt = "";
        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(3, 3))
        // ORIGINAL LINE: case "575":
        if (number.substring(3, 6).equals("575")) {
            strHgt = "86178" + number.substring(6);
        }
        // ORIGINAL LINE: case "570":
        else if (number.substring(3, 6).equals("570")) // 8615705xxx
        {
            if (number.substring(6, 7).equals("5")) {
                strHgt = "861705" + number.substring(7);
            }
        }
        // ORIGINAL LINE: case "384":
        else if (number.substring(3, 6).equals("384")) {
            strHgt = "86184" + number.substring(6);
        }
        // ORIGINAL LINE: case "385":
        else if (number.substring(3, 6).equals("385")) {
            strHgt = "86183" + number.substring(6);
        }
        // ORIGINAL LINE: case "386":
        else if (number.substring(3, 6).equals("386")) {
            strHgt = "86182" + number.substring(6);
        }
        // ORIGINAL LINE: case "383":
        else if (number.substring(3, 6).equals("383")) {
            strHgt = "86150" + number.substring(6);
        }
        // ORIGINAL LINE: case "381":
        else if (number.substring(3, 6).equals("381") || number.substring(3, 6).equals("382") || number.substring(3, 6).equals("388")
                || number.substring(3, 6).equals("389")) {
            strHgt = "8615" + number.substring(5);
        }
        // ORIGINAL LINE: case "387":
        else if (number.substring(3, 6).equals("387")) {
            strHgt = "8618" + number.substring(5);
        }
        // ORIGINAL LINE: case "577":
        else if (number.substring(3, 6).equals("577")) {
            strHgt = "8615" + number.substring(5);
        }
        // ORIGINAL LINE: case "578":
        else if (number.substring(3, 6).equals("578")) {
            strHgt = "8618" + number.substring(5);
        }
        // ORIGINAL LINE: case "579":
        else if (number.substring(3, 6).equals("579")) {
            strHgt = "86147" + number.substring(6);
        }
        // ORIGINAL LINE: case "380":
        else if (number.substring(3, 6).equals("380")) {
            strHgt = "86134" + number.substring(6);
        } else {
            if (number.substring(3, 5).equals("39")) {
                // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on
                // a string member and was converted to Java 'if-else' logic:
                // switch (number.Substring(8, 1))
                // ORIGINAL LINE: case "0":
                if (number.substring(8, 9).equals("0")) {
                    if (number.length() > 10) {
                        strHgt = "86135" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86135" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "1":
                else if (number.substring(8, 9).equals("1")) {
                    if (number.length() > 10) {
                        strHgt = "86136" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86136" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "2":
                else if (number.substring(8, 9).equals("2")) {
                    if (number.length() > 10) {
                        strHgt = "86137" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86137" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "3":
                else if (number.substring(8, 9).equals("3")) {
                    if (number.length() > 10) {
                        strHgt = "86138" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86138" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "4":
                else if (number.substring(8, 9).equals("4")) {
                    if (number.length() > 10) {
                        strHgt = "86139" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86139" + number.substring(9, 10) + number.substring(5, 8);
                    }
                } else {
                    if (number.length() > 9) {
                        strHgt = "8613" + number.substring(8, 9) + "0" + number.substring(5, 8) + number.substring(9);
                    } else {
                        strHgt = "8613" + number.substring(8, 9) + "0" + number.substring(5, 8);
                    }
                }
            } else if (number.substring(3, 5).equals("30")) {
                // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on
                // a string member and was converted to Java 'if-else' logic:
                // switch (number.Substring(9, 1))
                // ORIGINAL LINE: case "0":
                if (number.substring(9, 10).equals("0")) {
                    strHgt = "86130" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "1":
                else if (number.substring(9, 10).equals("1")) {
                    strHgt = "86176" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "2":
                else if (number.substring(9, 10).equals("2")) {
                    strHgt = "86132" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "3":
                else if (number.substring(9, 10).equals("3")) {
                    strHgt = "86156" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "4":
                else if (number.substring(9, 10).equals("4")) {
                    strHgt = "86155" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "5":
                else if (number.substring(9, 10).equals("5")) {
                    strHgt = "86185" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "6":
                else if (number.substring(9, 10).equals("6")) {
                    strHgt = "86186" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "7":
                else if (number.substring(9, 10).equals("7")) {
                    strHgt = "86145" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "9":
                else if (number.substring(9, 10).equals("9")) {
                    strHgt = "86131" + number.substring(8, 9) + number.substring(5, 8);
                } else {
                    strHgt = "E214:" + number + "无法转换为相应的E164号段";
                }
            }
        }
        return strHgt;
    }

    public static String E164ToE212(String number) {
        String strE212 = "";
        // Editor:Jianwen Sha
        // Eited time:2015-9-11 11:05:03
        // Description：若号段不带86，会出现截取异常，调整为：判断号段是否带86，不带则加上86头儿；
        if (!number.startsWith("86")) {
            number = "86" + number;
        }
        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(3, 2))
        // ORIGINAL LINE: case "78":
        if (number.substring(3, 5).equals("78")) {
            strE212 = "460075" + number.substring(5);
        }
        // ORIGINAL LINE: case "70":
        else if (number.substring(3, 5).equals("70")) // 861705xxx
        {
            if (number.substring(5, 6).equals("5")) {
                strE212 = "4600705" + number.substring(6);
            }
            //Editor:Jianwen Sha
            //Edited time:2015-10-13 14:28:01
            //Description:现在 861706 E164转E212规则
            //861706706---->4600706706
            else if (number.substring(5, 6).equals("6")) {
                strE212 = "4600706" + number.substring(6);
            } else {
                strE212 = "460070" + number.substring(5);
            }
        }
        // ORIGINAL LINE: case "72":
        else if (number.substring(3, 5).equals("72")) {
            strE212 = "460072" + number.substring(5);
        }
        // ORIGINAL LINE: case "84":
        else if (number.substring(3, 5).equals("84")) {
            strE212 = "460024" + number.substring(5);
        }
        // ORIGINAL LINE: case "83":
        else if (number.substring(3, 5).equals("83")) {
            strE212 = "460025" + number.substring(5);
        }
        // ORIGINAL LINE: case "82":
        else if (number.substring(3, 5).equals("82")) {
            strE212 = "460026" + number.substring(5);
        }
        // ORIGINAL LINE: case "50":
        else if (number.substring(3, 5).equals("50")) {
            strE212 = "460023" + number.substring(5);
        }
        // ORIGINAL LINE: case "51":
        else if (number.substring(3, 5).equals("51") || number.substring(3, 5).equals("52") || number.substring(3, 5).equals("58")
                || number.substring(3, 5).equals("59") || number.substring(3, 5).equals("87")) {
            strE212 = "46002" + number.substring(4);
        }
        // ORIGINAL LINE: case "57":
        else if (number.substring(3, 5).equals("57") || number.substring(3, 5).equals("88")) {
            strE212 = "46007" + number.substring(4);
        }
        // ORIGINAL LINE: case "47":
        else if (number.substring(3, 5).equals("47")) {
            strE212 = "460079" + number.substring(5);
        }
        // ORIGINAL LINE: case "34":
        else if (number.substring(3, 5).equals("34")) {
            strE212 = "460020" + number.substring(5);
        }
        // ORIGINAL LINE: case "35":
        else if (number.substring(3, 5).equals("35") || number.substring(3, 5).equals("36") || number.substring(3, 5).equals("37")
                || number.substring(3, 5).equals("38") || number.substring(3, 5).equals("39")) {
            if (number.substring(5, 6).equals("0")) {
                if (number.length() > 9) {
                    strE212 = "46000" + number.substring(6, 9) + number.substring(4, 5) + number.substring(9);
                } else {
                    strE212 = "46000" + number.substring(6, 9) + number.substring(4, 5);
                }
            } else {
                if (number.length() > 9) {
                    strE212 = "46000" + number.substring(6, 9) + (Integer.parseInt(number.substring(4, 5)) - 5) + number.substring(5, 6)
                            + number.substring(9);
                } else {
                    strE212 = "46000" + number.substring(6, 9) + (Integer.parseInt(number.substring(4, 5)) - 5) + number.substring(5, 6);
                }
            }
        }
        // ORIGINAL LINE: case "30":
        else if (number.substring(3, 5).equals("30")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "0";
        }
        // ORIGINAL LINE: case "31":
        else if (number.substring(3, 5).equals("31")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "9";
        }
        // ORIGINAL LINE: case "32":
        else if (number.substring(3, 5).equals("32")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "2";
        }
        // ORIGINAL LINE: case "45":
        else if (number.substring(3, 5).equals("45")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "7";
        }
        // ORIGINAL LINE: case "55":
        else if (number.substring(3, 5).equals("55")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "4";
        }
        // ORIGINAL LINE: case "56":
        else if (number.substring(3, 5).equals("56")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "3";
        }
        // ORIGINAL LINE: case "76":
        else if (number.substring(3, 5).equals("76")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "1";
        }
        // ORIGINAL LINE: case "85":
        else if (number.substring(3, 5).equals("85")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "5";
        }
        // ORIGINAL LINE: case "86":
        else if (number.substring(3, 5).equals("86")) {
            strE212 = "46001" + number.substring(6, 9) + number.substring(5, 6) + "6";
        } else {
            strE212 = "E164:" + number + "无法转换为相应的E212号段";
        }

        return strE212;
    }

    public static String E212ToE164(String number) {
        String strHgt = "";
        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(4, 2))
        // ORIGINAL LINE: case "75":
        if (number.substring(4, 6).equals("75")) {
            strHgt = "86178" + number.substring(6);
        }
        // ORIGINAL LINE: case "70":
        else if (number.substring(4, 6).equals("70")) // 4600705xxx
        {
            if (number.substring(6, 7).equals("5")) {
                strHgt = "861705" + number.substring(7);
            }
        }
        // ORIGINAL LINE: case "24":
        else if (number.substring(4, 6).equals("24")) {
            strHgt = "86184" + number.substring(6);
        }
        // ORIGINAL LINE: case "25":
        else if (number.substring(4, 6).equals("25")) {
            strHgt = "86183" + number.substring(6);
        }
        // ORIGINAL LINE: case "26":
        else if (number.substring(4, 6).equals("26")) {
            strHgt = "86182" + number.substring(6);
        }
        // ORIGINAL LINE: case "23":
        else if (number.substring(4, 6).equals("23")) {
            strHgt = "86150" + number.substring(6);
        }
        // ORIGINAL LINE: case "21":
        else if (number.substring(4, 6).equals("21") || number.substring(4, 6).equals("22") || number.substring(4, 6).equals("28")
                || number.substring(4, 6).equals("29")) {
            strHgt = "8615" + number.substring(5);
        }
        // ORIGINAL LINE: case "27":
        else if (number.substring(4, 6).equals("27")) {
            strHgt = "8618" + number.substring(5);
        }
        // ORIGINAL LINE: case "77":
        else if (number.substring(4, 6).equals("77")) {
            strHgt = "8615" + number.substring(5);
        }
        // ORIGINAL LINE: case "78":
        else if (number.substring(4, 6).equals("78")) {
            strHgt = "8618" + number.substring(5);
        }
        // ORIGINAL LINE: case "79":
        else if (number.substring(4, 6).equals("79")) {
            strHgt = "86147" + number.substring(6);
        }
        // ORIGINAL LINE: case "20":
        else if (number.substring(4, 6).equals("20")) {
            strHgt = "86134" + number.substring(6);
        } else {
            if (number.substring(4, 5).equals("0")) {
                // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on
                // a string member and was converted to Java 'if-else' logic:
                // switch (number.Substring(8, 1))
                // ORIGINAL LINE: case "0":
                if (number.substring(8, 9).equals("0")) {
                    if (number.length() > 10) {
                        strHgt = "86135" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86135" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "1":
                else if (number.substring(8, 9).equals("1")) {
                    if (number.length() > 10) {
                        strHgt = "86136" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86136" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "2":
                else if (number.substring(8, 9).equals("2")) {
                    if (number.length() > 10) {
                        strHgt = "86137" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86137" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "3":
                else if (number.substring(8, 9).equals("3")) {
                    if (number.length() > 10) {
                        strHgt = "86138" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86138" + number.substring(9, 10) + number.substring(5, 8);
                    }
                }
                // ORIGINAL LINE: case "4":
                else if (number.substring(8, 9).equals("4")) {
                    if (number.length() > 10) {
                        strHgt = "86139" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = "86139" + number.substring(9, 10) + number.substring(5, 8);
                    }
                } else {
                    if (number.length() > 9) {
                        strHgt = "8613" + number.substring(8, 9) + "0" + number.substring(5, 8) + number.substring(9);
                    } else {
                        strHgt = "8613" + number.substring(8, 9) + "0" + number.substring(5, 8);
                    }
                }
            } else if (number.substring(4, 5).equals("1")) {
                // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on
                // a string member and was converted to Java 'if-else' logic:
                // switch (number.Substring(9, 1))
                // ORIGINAL LINE: case "0":
                if (number.substring(9, 10).equals("0")) {
                    strHgt = "86130" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "1":
                else if (number.substring(9, 10).equals("1")) {
                    strHgt = "86176" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "2":
                else if (number.substring(9, 10).equals("2")) {
                    strHgt = "86132" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "3":
                else if (number.substring(9, 10).equals("3")) {
                    strHgt = "86156" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "4":
                else if (number.substring(9, 10).equals("4")) {
                    strHgt = "86155" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "5":
                else if (number.substring(9, 10).equals("5")) {
                    strHgt = "86185" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "6":
                else if (number.substring(9, 10).equals("6")) {
                    strHgt = "86186" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "7":
                else if (number.substring(9, 10).equals("7")) {
                    strHgt = "86145" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "9":
                else if (number.substring(9, 10).equals("9")) {
                    strHgt = "86131" + number.substring(8, 9) + number.substring(5, 8);
                } else {
                }
            }

        }
        return strHgt;
    }

    public static String HwE164ToE214(String number) {
        String strMgt = "";

        String Np1Gt = number;
        int count;
        if ((number.length() < 9) && !number.substring(3, 5).equals("34") && !number.substring(3, 5).equals("50")
                && !number.substring(3, 5).equals("51") && !number.substring(3, 5).equals("52") && !number.substring(3, 5).equals("57")
                && !number.substring(3, 5).equals("58") && !number.substring(3, 5).equals("59") && !number.substring(3, 5).equals("87")
                && !number.substring(3, 5).equals("88") && !number.substring(3, 5).equals("47") && !number.substring(3, 5).equals("83")) {
            count = 9 - number.length();
            for (int i = 0; i < count; i++) {
                Np1Gt += "E";
            }
        }

        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(3, 2))
        // ORIGINAL LINE: case "78":
        if (number.substring(3, 5).equals("78")) {
            strMgt = "861575" + number.substring(5);
        }
        // ORIGINAL LINE: case "84":
        else if (number.substring(3, 5).equals("84")) {
            strMgt = "861384" + number.substring(5);
        }
        // ORIGINAL LINE: case "83":
        else if (number.substring(3, 5).equals("83")) {
            strMgt = "861385" + number.substring(5);
        }
        // ORIGINAL LINE: case "82":
        else if (number.substring(3, 5).equals("82")) {
            strMgt = "861386" + number.substring(5);
        }
        // ORIGINAL LINE: case "50":
        else if (number.substring(3, 5).equals("50")) {
            strMgt = "861383" + number.substring(5);
        }
        // ORIGINAL LINE: case "51":
        else if (number.substring(3, 5).equals("51") || number.substring(3, 5).equals("52") || number.substring(3, 5).equals("58")
                || number.substring(3, 5).equals("59") || number.substring(3, 5).equals("87")) {
            strMgt = "86138" + number.substring(4);
        }
        // ORIGINAL LINE: case "57":
        else if (number.substring(3, 5).equals("57") || number.substring(3, 5).equals("88")) {
            strMgt = "86157" + number.substring(4);
        }
        // ORIGINAL LINE: case "47":
        else if (number.substring(3, 5).equals("47")) {
            strMgt = "861579" + number.substring(5);
        }
        // ORIGINAL LINE: case "34":
        else if (number.substring(3, 5).equals("34")) {
            strMgt = "861380" + number.substring(5);
        }
        // ORIGINAL LINE: case "35":
        else if (number.substring(3, 5).equals("35") || number.substring(3, 5).equals("36") || number.substring(3, 5).equals("37")
                || number.substring(3, 5).equals("38") || number.substring(3, 5).equals("39")) {
            if (number.substring(5, 6).equals("0")) {
                if (number.length() > 9) {
                    strMgt = "86139" + Np1Gt.substring(6, 9) + Np1Gt.substring(4, 5) + Np1Gt.substring(9);
                } else {
                    strMgt = "86139" + Np1Gt.substring(6, 9) + Np1Gt.substring(4, 5);
                }
            } else {
                if (number.length() > 9) {
                    strMgt = "86139" + Np1Gt.substring(6, 9) + (Integer.parseInt(Np1Gt.substring(4, 5)) - 5) + Np1Gt.substring(5, 6)
                            + Np1Gt.substring(9);
                } else {
                    strMgt = "86139" + Np1Gt.substring(6, 9) + (Integer.parseInt(Np1Gt.substring(4, 5)) - 5) + Np1Gt.substring(5, 6);
                }
            }
        }
        // ORIGINAL LINE: case "30":
        else if (number.substring(3, 5).equals("30")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "0";
        }
        // ORIGINAL LINE: case "31":
        else if (number.substring(3, 5).equals("31")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "9";
        }
        // ORIGINAL LINE: case "32":
        else if (number.substring(3, 5).equals("32")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "2";
        }
        // ORIGINAL LINE: case "45":
        else if (number.substring(3, 5).equals("45")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "7";
        }
        // ORIGINAL LINE: case "55":
        else if (number.substring(3, 5).equals("55")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "4";
        }
        // ORIGINAL LINE: case "56":
        else if (number.substring(3, 5).equals("56")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "3";
        }
        // ORIGINAL LINE: case "76":
        else if (number.substring(3, 5).equals("76")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "1";
        }
        // ORIGINAL LINE: case "85":
        else if (number.substring(3, 5).equals("85")) {
            strMgt = "86130" + Np1Gt.substring(6, 9) + Np1Gt.substring(5, 6) + "5";
        }
        // ORIGINAL LINE: case "86":
        else if (number.substring(3, 5).equals("86")) {
            strMgt = "86130" + number.substring(6, 9) + number.substring(5, 6) + "6";
        } else {
        }

        return strMgt;
    }

    public static String HwE214ToE164(String number) {
        String strHgt = "";
        // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on a
        // string member and was converted to Java 'if-else' logic:
        // switch (number.Substring(3, 3))
        // ORIGINAL LINE: case "575":
        if (number.substring(3, 6).equals("575")) {
            strHgt = "86178" + number.substring(6);
        }
        // ORIGINAL LINE: case "384":
        else if (number.substring(3, 6).equals("384")) {
            strHgt = "86184" + number.substring(6);
        }
        // ORIGINAL LINE: case "385":
        else if (number.substring(3, 6).equals("385")) {
            strHgt = "86183" + number.substring(6);
        }
        // ORIGINAL LINE: case "386":
        else if (number.substring(3, 6).equals("386")) {
            strHgt = "86182" + number.substring(6);
        }
        // ORIGINAL LINE: case "383":
        else if (number.substring(3, 6).equals("383")) {
            strHgt = "86150" + number.substring(6);
        }
        // ORIGINAL LINE: case "381":
        else if (number.substring(3, 6).equals("381") || number.substring(3, 6).equals("382") || number.substring(3, 6).equals("388")
                || number.substring(3, 6).equals("389")) {
            strHgt = "8615" + number.substring(5);
        }
        // ORIGINAL LINE: case "387":
        else if (number.substring(3, 6).equals("387")) {
            strHgt = "8618" + number.substring(5);
        }
        // ORIGINAL LINE: case "577":
        else if (number.substring(3, 6).equals("577")) {
            strHgt = "8615" + number.substring(5);
        }
        // ORIGINAL LINE: case "578":
        else if (number.substring(3, 6).equals("578")) {
            strHgt = "8618" + number.substring(5);
        }
        // ORIGINAL LINE: case "579":
        else if (number.substring(3, 6).equals("579")) {
            strHgt = "86147" + number.substring(6);
        }
        // ORIGINAL LINE: case "380":
        else if (number.substring(3, 6).equals("380")) {
            strHgt = "86134" + number.substring(6);
        } else {
            if (number.substring(3, 5).equals("39")) {
                // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on
                // a string member and was converted to Java 'if-else' logic:
                // switch (number.Substring(8, 1))
                // ORIGINAL LINE: case "0":
                if (number.substring(8, 9).equals("0")) {
                    if (number.length() > 10) {
                        strHgt = "86135" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = ("86135" + number.substring(9, 10) + number.substring(5, 8)).replace("E", "");
                    }
                }
                // ORIGINAL LINE: case "1":
                else if (number.substring(8, 9).equals("1")) {
                    if (number.length() > 10) {
                        strHgt = "86136" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = ("86136" + number.substring(9, 10) + number.substring(5, 8)).replace("E", "");
                    }
                }
                // ORIGINAL LINE: case "2":
                else if (number.substring(8, 9).equals("2")) {
                    if (number.length() > 10) {
                        strHgt = "86137" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = ("86137" + number.substring(9, 10) + number.substring(5, 8)).replace("E", "");
                    }
                }
                // ORIGINAL LINE: case "3":
                else if (number.substring(8, 9).equals("3")) {
                    if (number.length() > 10) {
                        strHgt = "86138" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = ("86138" + number.substring(9, 10) + number.substring(5, 8)).replace("E", "");
                    }
                }
                // ORIGINAL LINE: case "4":
                else if (number.substring(8, 9).equals("4")) {
                    if (number.length() > 10) {
                        strHgt = "86139" + number.substring(9, 10) + number.substring(5, 8) + number.substring(10);
                    } else {
                        strHgt = ("86139" + number.substring(9, 10) + number.substring(5, 8)).replace("E", "");
                    }
                } else {
                    if (number.length() > 9) {
                        strHgt = "8613" + number.substring(8, 9) + "0" + number.substring(5, 8) + number.substring(9);
                    } else {
                        strHgt = ("8613" + number.substring(8, 9) + "0" + number.substring(5, 8)).replace("E", "");
                    }
                }
            }
            if (number.substring(3, 5).equals("30")) // 閼辨棃锟介柈銊ュ瀻閸欓攱顔�
            {
                number = number.replace("e", "E");
                // C# TO JAVA CONVERTER NOTE: The following 'switch' operated on
                // a string member and was converted to Java 'if-else' logic:
                // switch (number.Substring(9, 1))
                // ORIGINAL LINE: case "0":
                if (number.substring(9, 10).equals("0")) {
                    strHgt = "86130" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "1":
                else if (number.substring(9, 10).equals("1")) {
                    strHgt = "86176" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "2":
                else if (number.substring(9, 10).equals("2")) {
                    strHgt = "86132" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "3":
                else if (number.substring(9, 10).equals("3")) {
                    strHgt = "86156" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "4":
                else if (number.substring(9, 10).equals("4")) {
                    strHgt = "86155" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "5":
                else if (number.substring(9, 10).equals("5")) {
                    strHgt = "86185" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "6":
                else if (number.substring(9, 10).equals("6")) {
                    strHgt = "86186" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "7":
                else if (number.substring(9, 10).equals("7")) {
                    strHgt = "86145" + number.substring(8, 9) + number.substring(5, 8);
                }
                // ORIGINAL LINE: case "9":
                else if (number.substring(9, 10).equals("9")) {
                    strHgt = "86131" + number.substring(8, 9) + number.substring(5, 8);
                } else {
                }
                strHgt = strHgt.replace("E", "");
            }
        }
        return strHgt;
    }

    public static String E212ToE214(String number) {
        // E164: 861301234
        // E212: 4600123410
        // E214: 8613023410

        return number.replace("46001", "86130");
    }
}

package com.company.leetcode;

import java.util.Arrays;

/**
 * @author Eric Cheng
 */
public class 分发饼干_455 {

  public static void main(String[] args) {
    int[] a = { 1226,
        312, 534, 981, 249, 968, 420, 1359, 955, 641, 1285, 992, 564, 434, 128, 354, 583, 395, 1360,
        304, 1472, 160, 1137, 244, 768, 1112, 1347, 317, 929, 1168, 427, 641, 1218, 992, 1252, 1530,
        178, 705, 289, 362, 938, 286, 1171, 1072, 1334, 1292, 1157, 1432, 1416, 1406, 603, 1266,
        1039, 378, 1249, 1003, 979, 683, 388, 1290, 1224, 993, 1298, 1317, 1198, 1359, 429, 669,
        1546, 77, 595, 750, 110, 608, 1120, 386, 434, 174, 1461, 305, 1407, 1039, 945, 960, 1214,
        1417, 1015, 1229, 1445, 119, 1337, 1454, 266, 28, 638, 388, 397, 936, 226, 142, 1485, 883,
        842, 541, 1095, 1536, 1314, 1053, 1005, 1335, 1155, 291, 1164, 489, 308, 175, 510, 1355,
        1445, 1305, 1325, 143, 70, 1049, 1442, 137, 259, 1256, 74, 383, 396, 178, 664, 89, 1100,
        718, 341, 39, 444, 1018, 720, 350, 566, 1481, 736, 1303, 1505, 1440, 843, 551, 1418, 32,
        685, 1339, 52, 1496, 318, 553, 651, 767, 1504, 1143, 371, 974, 1468, 971, 1212, 111, 1194,
        494, 1481, 946, 1188, 961, 1511, 1305, 244, 35, 802, 263, 36, 51, 702, 1011, 1073, 617, 502,
        200, 402, 1249, 251, 215, 605, 117, 651, 548, 109, 212, 809, 230, 763, 1136, 402, 470, 967,
        916, 1183, 157, 1387, 590, 724, 264, 377, 1092, 1544, 715, 288, 1411, 838, 170, 1087, 717,
        1454, 915, 123, 479, 374, 218, 222, 1057, 1298, 59, 1283, 1360, 220, 1510, 1023, 597, 46,
        972, 536, 425, 467, 526, 275, 1532, 103, 190, 308, 1035, 46, 635, 105, 834, 290, 1344, 448,
        1164, 504, 886, 191, 158, 312, 1271, 306, 1518, 1157, 181, 294, 1245, 1085, 841, 903, 811,
        531, 1375, 123, 1183, 1481, 66, 1240, 252, 265, 568, 192, 742, 490, 970, 383, 1217, 1081,
        1043, 639, 120, 620, 1319, 1489, 1246, 606, 471, 1230, 244, 807, 753, 1268, 1050, 719, 316,
        105, 1219, 851, 727, 1075, 560, 998, 560, 969, 146, 1145, 1211, 390, 107, 1090, 677, 1385,
    };
    int[] b =
        { 29, 310, 236, 441, 200, 267, 115, 59, 277, 42, 361, 112, 483, 104, 338, 69, 438, 55, 318,
            470, 20, 490, 455, 119, 259, 51, 492, 50, 160, 414, 38, 289, 429, 446, 350, 412, 12,
            515, 367, 397, 122, 35, 522, 355, 448, 266, 333, 500, 211, 226, 203, 366, 240, 324, 111,
            280, 520, 321, 211, 360, 437, 292, 512, 161, 85, 139, 12, 211, 236, 213, 377, 85, 494 };
    System.out.println(findContentChildren(a, b));
    System.out.println(b);
  }

  /**
   * Accepted
   * 21/21 cases passed (10 ms)
   * Your runtime beats 99.35 % of java submissions
   * Your memory usage beats 95.97 % of java submissions (39.5 MB)
   */
  public static int findContentChildren(int[] g, int[] s) {
    if (g.length == 0 || s.length == 0) {
      return 0;
    }
    Arrays.sort(s);
    Arrays.sort(g);
    int lastCookieIndex = 0;
    int count = 0;
    for (int child : g) {
      boolean found = false;
      for (int i = lastCookieIndex; i < s.length; ++i) {
        if (child <= s[i]) {
          found = true;
          count++;
          lastCookieIndex = i + 1;
          break;
        }
      }
      if (!found) {
        break;
      }
    }
    return count;
  }
}

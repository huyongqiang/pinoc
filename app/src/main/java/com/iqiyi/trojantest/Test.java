package com.iqiyi.trojantest;

import com.iqiyi.trojan.Trojan;

import java.util.Random;

import xiaofei.library.zlang.Library;

/**
 * Created by Eric on 2017/10/18.
 */

public class Test {

    /*void g1(String s, int i) {
        Object result = Trojan.onEnterMethod("Test", "g1", "(Ljava/lang/String;I)V", this, new Object[]{s, i});
        if (result != Library.NO_RETURN_VALUE) {
            return;
        }
        System.out.println();
    }
    private int g2(String a, MainActivity j, Boolean k) {
        Object result = Trojan.onEnterMethod("MainActivity", "g", "()V", this, new Object[]{a,j ,k});
        if (result != Library.NO_RETURN_VALUE) {
            if (result instanceof Integer) {
                return (int) result;
            }
        }
        @U int kk = -9;
        if (new Random().nextInt() > kk) {
            return kk;
        }
        ++kk;
        return kk;
    }

    private Integer g3() {
        Object result = Trojan.onEnterMethod("MainActivity", "g", "()V", this, new Object[]{});
        if (result != Library.NO_RETURN_VALUE) {
            if (result instanceof Integer) {
                return (Integer) result;
            }
        }
        result = null;
        return null;
    }
*/
    private Integer returnValueInteger1(int a) {
        Object result = Trojan.onEnterMethod("MainActivity", "g", "()V", this, new Object[]{a});
        if (result != Library.NO_RETURN_VALUE) {
            if (result == null) {
                return null;
            }
            if (result instanceof Integer) {
                return (Integer) result;
            }
        }
        int s = 0;
        int k = 1;
        return s + k + 1;
    }
    private Integer returnValueInteger2(int a) {
        int s = 0;
        int k = 1;
        return s + k + 1;
    }

    private int returnValueInt1(int a) {
        Object result = Trojan.onEnterMethod("MainActivity", "g", "()V", this, new Object[]{a});
        if (result != Library.NO_RETURN_VALUE) {
            if (result instanceof Integer) {
                return (Integer) result;
            }
        }
        int s = 0;
        int k = 1;
        return s + k + 1;
    }

    private int returnValueInt2(int a) {
        int s = 0;
        int k = 1;
        return s + k + 1;
    }

    private void void1(Boolean a, int b) {
        a = (b == b);
    }

    private Void void2(Boolean a, int b) {
        return null;
    }

//    private Void void3(Boolean a, int b) {
//        Object result = Trojan.onEnterMethod("MainActivity", "g", "()V", this, new Object[]{a});
//        if (result != Library.NO_RETURN_VALUE) {
//            return null;
//        }
//        a = (b == b);
//        return null;
//    }
}

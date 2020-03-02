package com.company;

/*

1210 Three methods and maximum
Write public static methods: int max (int, int), long max (long, long), double max (double, double).
Each method should return the maximum of the two numbers passed to it.

Requirements:
1. The program should not display text on the screen.
2. The Solution class must contain four methods.
3. The Solution class must contain the static method int max (int, int).
4. The int max (int, int) method should return the maximum of two numbers of type int.
5. The Solution class must contain the static method long max (long, long).
6. The long max (long, long) method should return the maximum of two long type numbers.
7. The Solution class must contain the static method double max (double, double).
8. The double max (double, double) method should return the maximum of two doubles.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static long max(long a, long b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }
}

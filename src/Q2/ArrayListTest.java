package Q2;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Dynamic array/list operator: add, remove, get, set
        // add(obj), add (index, obj)
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<WrapperType> for primitive types

        for (int i = 0; i < 100; i++) {
            int rand = (int)(Math.random() * 100) + 1;
            list.add(rand);
        }

        for (int i = 0; i < list.size(); i += 2)
            System.out.print(list.get(i) + " ");
        System.out.println();

        System.out.println("Does list contain 50? " + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));

        list.add(2, 999);
        list.set(0, 123);

        for (int num : list)
            System.out.println(num);
    }
}

/*
40 78 22 66 51 35 26 63 47 99 50 20 27 8 3 22 29 58 94 96 4 39 65 52 32 59 14 7 96 38 59 80 66 88 91 81 81 96 30 43 19 99 76 74 2 8 18 8 68 3
Does list contain 50? true
Index of 50: 20
123
22
999
78
58
22
11
66
34
51
45
35
31
26
90
63
5
47
5
99
86
50
12
20
72
27
56
8
18
3
49
22
60
29
58
58
94
94
18
96
25
4
39
39
89
65
14
52
64
32
95
59
61
14
100
7
29
96
24
38
65
59
66
80
77
66
7
88
35
91
74
81
70
81
97
96
89
30
66
43
22
19
57
99
16
76
1
74
38
2
70
8
64
18
29
8
96
68
21
3
44
 */

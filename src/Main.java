import java.util.*;

public class Main {
    //请完成上传一份Java的代码，代码包括Java Random，Math，String类相关成员函数的使用，ArrayList，Set，HashMap等各种容器类的使用。
    public static void  print(int index, Object object) {
        System.out.println(String.format("{%d}, %s", index, object.toString()));
    }

    public static void demoRandom() {
        Random random = new Random();
        random.setSeed(1);
        print(1, random.nextInt(1000));
        print(2, random.nextFloat());

        List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        Collections.shuffle(array);
        print(3, array);

        Date date = new Date();
        print(4, date);
        print(5, date.getTime());

    }

    public static void demoMath() {
        print(1, Math.log(3));
        print(2, Math.min(3, 5));
        print(3, Math.max(3, 5));
        print(4, Math.ceil(2.2));
        print(5, Math.floor(4.5));
    }
    public static void demoString() {
        String str = "hello world";
        print(1, str.indexOf('x'));
        print(2, str.charAt(1));
        print(3, str.codePointAt(1));
        print(4, str.compareToIgnoreCase("HELLO WORLD"));
        print(5, str.compareTo("hello vorld"));
        print(6, str.compareTo("hello xorld"));
        print(7, str.contains("hello"));
        print(8, str.concat("!!!"));
        print(9, str.toUpperCase());
        print(10, str.endsWith("world"));
        print(11, str.startsWith("hell"));
        print(12, str.replace('o', 'e'));
        print(13, str.replaceAll("o|l", "a"));
        print(14, str.replaceAll("hello", "hi"));
        print(15, str + str);

        StringBuilder sb = new StringBuilder();
        sb.append("x ");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        print(16, sb.toString());
    }

    public static void demoList() {
        List<String> strList = new ArrayList<String>(10);
        for ( int i= 0; i <4 ; ++i){
            strList.add(String.valueOf(i*i));
        }
        print(1, strList);
        List<String> strListB = new ArrayList<String>();
        for (int i=0; i< 4; ++i) {
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2, strList);

        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1));
        print(4, strList);
        print(5, strList.get(1));

        Collections.reverse(strList);
        print(6, strList);

        Collections.sort(strList);
        print(7, strList);

        Collections.sort(strList, new Comparator<String>(){
            public int compare( String o1, String o2){
                return o2.compareTo(o1);
            }
        });
        print(8, strList);

        for (String obj : strList) {
            print(9, obj);
        }

        for (int i=0; i < strList.size(); ++i) {
            print(10, strList.get(i));
        }

        int[] array = new int[]{1, 2, 3};
        print(11, array[1]);

    }

    public static void demoMapTable() {
        Map<String, String> map = new HashMap<String, String>();
        for( int i=0; i< 4; ++i) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry: map.entrySet())   {
            print(2, entry.getKey() + "|" + entry.getValue());
        }
        print(3,map.values());
        print(4, map.keySet());
        print(5, map.get("3"));
        print(6, map.containsKey("A"));
        map.replace("3", "27");
        print(7, map.get("3"));
    }

    public static void demoSet() {

        Set<String> strSet = new HashSet<String>();
        for (int i=0; i<3;++i) {
            strSet.add((String.valueOf(i)));
            strSet.add((String.valueOf(i)));
            strSet.add((String.valueOf(i)));
        }
        print(1, strSet);
        strSet.remove(String.valueOf(1));
        print(2, strSet);
        print(3, strSet.contains(String.valueOf(1)));
        print(4, strSet.isEmpty());
        print(5, strSet.size());

        strSet.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(6, strSet);
        for (String value: strSet){
            print(7, value);
        }
    }


    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //print(1,"Hello World");
        //demoString();
        //demoList();
        //demoMapTable();
        //demoSet();
        //demoRandom();
        demoMath();
    }

}

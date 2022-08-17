import quickfix.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConvertToJavaObject {

    public void convert(File file) throws IOException, ConfigError, InvalidMessage, FieldNotFound {
        final DataDictionary dictionary = new DataDictionary("src/main/resources/CustomFIX.xml");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            line.replace("\n", "");
            Message message = new Message(line, false);
//            com.fss.quickfix.Message message1 = (com.fss.quickfix.Message) MessageUtils.parse(new com.fss.quickfix.MessageFactory(),dictionary,line, false);
//            System.out.println(message1);
            List<Integer> list = getAllFields(line);
            System.out.println("\n-----------------------------------------------------");
            for (Integer i : list) {
//                if(!message.isSetField(i)) continue;
//                String dataLine = message.getField(new StringField(i)).toString();
//                String data = dataLine.substring(dataLine.indexOf("=")+1);
//
//                System.out.printf(dictionary.getFieldName(i) + ": "
//                        + data + ", ");

            }

            Iterator<Field<?>> iterator = message.iterator();
            while (iterator.hasNext()) {
                Field<?> field = iterator.next();
                // field.getObject
                // field.getTag
            }
        }
    }

    private List<Integer> getAllFields(String string) {
        List<Integer> result = new ArrayList<>();
        String[] list = string.split("\u0001");
        for (String s : list) {
            s = s.substring(0, s.indexOf("="));
            if (s.equals("")) continue;
            result.add(Integer.valueOf(s));
        }
        return result;
    }

    public static void main(String[] args) throws ConfigError, IOException, InvalidMessage, FieldNotFound {
        ConvertToJavaObject convertToJavaObject = new ConvertToJavaObject();
        convertToJavaObject.convert(new File("src/main/resources/infogateclient.20200529.dat"));
    }
}


// semantic ui .com
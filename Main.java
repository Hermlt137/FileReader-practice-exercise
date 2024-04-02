import java.io.*;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;


public class Main {    
        public static void main(String[] args) {
        try{String filePath = "C:\\Users\\孙唐林\\Downloads\\Groceries.txt";
            String fileToWrite = "C:\\Users\\孙唐林\\Downloads\\Groceries.txt";

            String [] array = new String[4];
            String id;
            String item;
            String quantity;
            double price;
            String separtor =  ",";
            double total = 0;

            

            FileReader fileReader = new FileReader(filePath);
            FileWriter fileWriter = new FileWriter(fileToWrite);

            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
         
            double totalPrice = 0.0;

            String line;

                    
            while((line = reader.readLine()) != null ){
                    array = line.split(separtor);

                    price = Double.parseDouble(array[3]);

                    total += price;

                    System.out.println(line);
                    writer.write(line);
                    writer.newLine();

                }
                    

            System.out.println("Total price of groceries:" + " " + Math.round(total));
            writer.write("Total price of groceries:" + " " + Math.round(total));


            reader.close();

            writer.flush();
            writer.close();}catch(IOException e){
                throw new RuntimeException("quit");
            }
   
        }

}

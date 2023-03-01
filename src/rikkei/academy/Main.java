package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai báo mảng chứa danh sách sinh viên
        String[] student = {"Ha","Anh","Hanh","Yen","Hoa"};
        System.out.println("Enter the name's student : ");
        // khai báo biến lưu tên tìm kiếm gán với giá trị nhập vào
        String input_name = scanner.nextLine();
        boolean isExist = false;
        // duyệt mảng, tìm phần tử có giá trị bằng với tên đã nhập vào
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)){
                System.out.println("position of the student in the list "+input_name+" is " +i);
                isExist= true;
                break;
            }
        }
        if (!isExist){
            System.out.println("not found " + input_name +" in the list");
        }
    }
}
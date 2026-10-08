import java.util.Scanner;

public class StudiKasus203 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String studentName;
    String activityType;
    int documents;
    int rank;
    int fundingStat;

    System.out.print("Nama mahasiswa  : ");
    studentName = sc.next();
    System.out.print("Jenis kegiatan  : ");
    activityType = sc.next();
    System.out.print("Jumlah dokumen  : ");
    documents = sc.nextInt();
    System.out.print("Peringkat juara : ");
    rank = sc.nextInt();
    System.out.print("Lolos pendanaan : ");
    fundingStat = sc.nextInt();

    if (activityType.equalsIgnoreCase("BELMAWA") || activityType.equalsIgnoreCase("BAKORMA") || activityType.equalsIgnoreCase("Mandiri")) {
      if (documents < 4) {
        if (rank < 4) {
          System.out.println("Dana pendanaan diberikan");
        } else {
          System.out.println("Peringkat kejuaraan tidak sesuai syarat. Dana pendanaan tidak diberikan"); 
        }
      } else {
        System.out.println("Dokumen tidak lengkap, kurang "+(4-documents)+" dokumen");
      }
    } else if (activityType.equalsIgnoreCase("pkm")) {
      if (documents < 4) {
        if (fundingStat == 1) {
          System.out.println("Dana pendanaan diberikan");
        } else {
          System.out.println("Proposal tidak lolos pendanaan");
        }
      } else {
        System.out.println("Dokumen tidak lengkap, kurang "+(4-documents)+" dokumen");
      }
    } else {
      System.out.println("Kegiatan tidak sesuai syarat pendanaan");
    }

    sc.close();
  }
}

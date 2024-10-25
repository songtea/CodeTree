import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rockCnt = sc.nextInt(); // 돌의 갯수
        int[][] arr = new int[rockCnt - 1][2]; // 에너지 값을 저장할 배열

        for(int i = 0; i < arr.length; i++) { // 에너지 값 배열에 저장
            for(int j = 0; j < arr[i].length; j++){                
                arr[i][j] = sc.nextInt();
            }
        }

        int threeStep = sc.nextInt(); // 3칸 이동 변수
        int[] energyArr = new int[rockCnt];
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];

            if(a * 2 <= b) {
                if(a * 3 <= threeStep) {
                    energyArr[idx] = a;
                    idx++;
                }else{
                    energyArr[idx] = threeStep;
                    idx++;
                    threeStep = 5001;
                }
            }else if(a * 2 >= b) {
                if(b * 1.5 <= threeStep) {
                    energyArr[idx] = b;
                    idx++; 
                }else{
                    energyArr[idx] = threeStep;
                    idx++;
                    threeStep = 5001;
                }
            }
        }
        
        energyArr[energyArr.length - 1] = threeStep;
        int step = 0, cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < energyArr.length; k++) {
                    if(step >= rockCnt) {
                        break;
                    }

                    if(arr[i][0] == energyArr[k]) {
                        step += 1;
                        cnt++;
                    }else if(arr[i][1] == energyArr[k]){
                        step += 2;
                        cnt++;
                    }else{
                        step += 3;
                        cnt++;
                    }
                }
            }
        }

        int result = 0;

        for(int i = 0; i < cnt - 1; i++) {
            result += energyArr[i];
        }

        System.out.print(result);
    }
}
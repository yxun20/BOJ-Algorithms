#include <stdio.h>

// 하노이 타워 알고리즘 함수
// n: 원판의 개수
// source: 출발지
// auxiliary: 보조 기둥
// destination: 목적지
int hanoi(int n, char source, char auxiliary, char destination) {
    if (n == 1) {
        // 원판이 1개인 경우, 출발지에서 목적지로 원판을 이동
        //printf("%c %c\n", source, destination);
        return 1; // 이동 비용 1 반환
    }
    else {
        int cost = 0;
        // 1부터 n-1까지의 원판을 출발지에서 보조 기둥으로 이동
        cost +=hanoi(n - 1, source, destination, auxiliary);
        // n번째 원판을 출발지에서 목적지로 이동
        //printf("%c %c\n", source, destination);
        cost =cost+1; // 이동 비용을 원판의 번호로 업데이트
        // 보조 기둥에 있는 원판들을 목적지로 이동
        cost += hanoi(n - 1, auxiliary, source, destination);
        return cost; // 총 이동 비용 반환
    }
}

int hanoip(int q, char sourcee, char auxiliarye, char destinatione) {
    if (q == 1) {
        // 원판이 1개인 경우, 출발지에서 목적지로 원판을 이동
        printf("%c %c\n", sourcee, destinatione);
        return 1;
    }
    else {
        int coste = 0;
        // 1부터 n-1까지의 원판을 출발지에서 보조 기둥으로 이동
        coste += hanoip(q - 1, sourcee, destinatione, auxiliarye);
        // n번째 원판을 출발지에서 목적지로 이동
        printf("%c %c\n", sourcee, destinatione);
        coste = coste + 1; // 이동 비용을 원판의 번호로 업데이트
        // 보조 기둥에 있는 원판들을 목적지로 이동
        coste += hanoip(q - 1, auxiliarye, sourcee, destinatione);
        return coste; // 총 이동 비용 반환
    }
}

int main() {
    // 입력 파일과 출력 파일 포인터 생성
    

    int n;
    scanf("%d", &n); // 다음 줄에서 원판의 개수를 읽음
    int q = n;
    int totalcnt = hanoi(n, '1', '2', '3');
    printf("%d\n", totalcnt);
    int goal=hanoip(q, '1', '2', '3');
    //printf("%d\n", goal);
    return 0;
}
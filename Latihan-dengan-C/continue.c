// Melakukan operasi 10 bilangan positif yang dimasukkan oleh user
// Jika bilangan negatif akan di lewati

#include <stdio.h>

int main(){
    int i;
    double number, sum = 0.0;

    for(i = 0; i < 10; i++){
        printf("Masukkan angka: ");
        scanf("%lf", &number);

        if(number < 0.0){
            continue;
        }

        sum += number;
    }
    printf("Total nilai: %.2lf \n", sum);
    return 0;
}
n = int(input("Masukkan panjang deret: "))

n1 = 0
n2 = 1
count = 0

list_fibonaci = []
while count < n:
    list_fibonaci.append(n1)
    bilangan_terakhir = n1 + n2
    n1 = n2
    n2 = bilangan_terakhir
    count += 1
    
print(list_fibonaci)
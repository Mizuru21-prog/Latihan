# jadi disini bakal menghitung banyak kata dengan split
kata = input("masukkan kata: ")

count = 0

while count < len(kata.split(' ')):
    count += 1
    
print(count)

""" Takes 0.02 seconds. """
def weird_algo(n):
    arr = [n]
    hash_set = set()
    hash_set.add(n)
    
    while n != 1:
        if n % 2 == 0:
            n //= 2
        else:
            n = n * 3 + 1
        
        if n not in hash_set:
            arr.append(n)
            hash_set.add(n)
    
    return arr

def main():
    n = int(input())
    result = weird_algo(n)
    print(*result)

if __name__ == "__main__":
    main()

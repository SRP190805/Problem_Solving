def TwoSum(a, t):
    s = a
    y = t
    indices = []
    for i in range(len(s)):
        for j in range(len(s)-1,i,-1):
            if(s[i] + s[j] == y):
                indices.append(i)
                indices.append(j)
                break
            else:
                continue
        if(indices):
            break
    return indices

def main(test):
    arr = list(map(int, input(" ").split(" ")))
    target = int(input(" "))
    x = TwoSum(arr,target)
    print(x)
    while(test):
        if(test):
            main(test - 1)
        else:
            return " "
        test -= 1

test = int(input(" "))        
main(test)

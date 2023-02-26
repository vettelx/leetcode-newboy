def reverse(a,begin,end):
    while(begin<end):
        a[begin],a[end] = a[end],a[begin]
        begin+=1
        end-=1
        

def rotate(a,m):
    reverse(a,0,m)
    reverse(a,m+1,len(a)-1)
    reverse(a,0,len(a)-1)        
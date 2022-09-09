# https://www.hackerrank.com/challenges/python-tuples
# Tuple
# https://www.sadikturan.com/python-objeleri-ve-veri-yapilari/python-tuple/1377
# Hashing
# https://www.ozgurcyaman.com/2020/05/python-hashing-fonksiyonu.html

if __name__ == '__main__':
    n = int(input())
    integer_list = map(int, input().split())
    integer_list = list(integer_list)
    t = tuple(integer_list)
    print(hash(t))
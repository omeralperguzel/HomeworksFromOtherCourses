<h1>Binary Search Tree Sorusu</h1>
<h2>Soru</h2>
<br>
<p>
<b>[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]</b> dizisinin Binary-Search-Tree aşamalarını yazınız.<br>
<br>
Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.<br>
</p>
<br>
<h2>Search Tree Çözüm Aşamaları</h2>
<br>
<p>
Dizinin ikinci sırasındaki sayıyı root olarak seçip ardından ondan büyük sayıları sağa, ondan küçük sayıları sola yazdım.<br>
<br>
<b>Seçilen Kök:</b> 5</b>
</p>
<br>
<p>1. Aşama</p>

```
  5
 / \
    7
```
<p>2. Aşama</p>

```
  5
 / \
1   7
```
<p>3. Aşama</p>

```
  5
 / \
1   7
     \
      8
```

<p>4. Aşama</p>

```
  5
 / \
1   7
 \   \
  3   8
```
<p>5. Aşama</p>

```
     5
  /     \
 1       7
  \     / \
   3   6   8
```
<p>6. Aşama</p>

```
      5
   /     \
  1       7
 / \     / \
0   3   6   8
```
<p>7. Aşama</p>

```
      5
   /     \
  1       7
 / \     / \
0   3   6   8
             \
              9
```
<p>8. Aşama</p>

```

      5
   /     \
  1       7
 / \     / \
0   3   6   8
   / \       \
      4       9
```
<p>9. Aşama</p>

```
      5
   /     \
  1       7
 / \     / \
0   3   6   8
   / \       \
  2   4       9
```


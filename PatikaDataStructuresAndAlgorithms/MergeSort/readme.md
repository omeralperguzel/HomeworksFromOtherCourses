<h1>Merge Sort Sorusu</h1>
<h2>Soru</h2>
<br>
<p>[16,21,11,8,12,22] -> Merge Sort


1- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız..<br>
2- Big-O gösterimini yazınız.<br>
</p>
<br>
<h2>Sorting Çözüm Aşamaları</h2>
<br>
<p>
1- [ 16, 21, 11, 8, 12, 22 ] dizisi ikiye bölünür.<br>
2- [ 16, 21, 11] ve [8, 12, 22 ] şeklinde ikiye bölündü.<br>
3- [ 16, 21]-[11] ve [8, 12]-[22 ] şeklinde bir daha böldük. Artık bunları yeniden birleştirebiliriz.<br>
4- [ 11, 16, 21] ve [8, 12, 22] şeklinde birleştirdik. Geriye son 2 grubu birleştirmek kaldı.<br>
5- [ 8, 11, 12, 16, 21, 22] şeklinde sıralandı.<br>
</p>
<br>
<h2>Big-O Notation Gösterimi</h2>
<br>
<p>
Bölme yapılırken log(n) kere bölme işlemi yapılırken birleştirme sırasında n kere birleştirme işlemi yapılır.<br>
<b>Worst Case:</b> O (nlog(n))<br>
<b>Average Case:</b> O (nlog(n))<br>
<b>Best Case:</b> O (nlog(n))<br>
</p>
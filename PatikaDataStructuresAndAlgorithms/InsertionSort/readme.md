<h1>Insertion Sort Sorusu</h1>
<h2>Soru</h2>
<br>
<p>[22,27,16,2,18,6] -> Insertion Sort

1- Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.<br>
2- Big-O gösterimini yazınız.<br>
3- Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.<br>
4- Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.</p>
<br>
<h2>Sorting Çözüm Aşamaları</h2>
<br>
<p>[ <b>22</b>, 27, 16, 2, 18, 6 ]<br>
[ 22, <b>27</b>, 16, 2, 18, 6 ]<br>
[ 22, 27, <b>16</b>, 2, 18, 6 ] DEĞİŞECEK<br>
[ 22, <b>16, 27</b>, 2, 18, 6 ] DEĞİŞECEK<br>
[ <b>16, 22, 27</b>, 2, 18, 6 ] DEĞİŞTİ<br>
[ 16, 22, 27, <b>2</b>, 18, 6 ] DEĞİŞECEK<br>
[ 16, 22, <b>2, 27</b>, 18, 6 ] DEĞİŞECEK<br>
[ 16, <b>2, 22, 27</b>, 18, 6 ] DEĞİŞECEK<br>
[ <b>2, 16, 22, 27</b>, 18, 6 ] DEĞİŞTİ<br>
[ 2, 16, 22, 27, <b>18</b>, 6 ] DEĞİŞECEK<br>
[ 2, 16, 22, <b>18, 27</b>, 6 ] DEĞİŞECEK<br>
[ 2, 16, <b>18, 22, 27</b>, 6 ] DEĞİŞTİ<br>
[ 2, 16, 18, 22, 27, <b>6</b> ] DEĞİŞECEK<br>
[ 2, 16, 18, 22, <b>6, 27</b> ] DEĞİŞECEK<br>
[ 2, 16, 18, <b>6, 22, 27</b> ] DEĞİŞECEK<br>
[ 2, 16, <b>6, 18, 22, 27</b> ] DEĞİŞECEK<br>
[ 2, <b>6, 16, 18, 22, 27</b> ] DEĞİŞTİ<br>
</p>
<br>
<h2>Big-O Notation Gösterimi</h2>
<br>
<p><b>Worst Case:</b> O (n²)<br>
<b>Average Case:</b> O (n²)<br>
<b>Best Case:</b> O (n)<br>
</p>
<br>
<h2>Time Complexity Nedir?</h2>
<br>
<p><b>Worst Case:</b> [ 27,22,18,16,6,2 ] -> O (n²)<br>
<b>Best Case:</b> [ 2,6,16,18,22,27 ] -> O (n)<br>
</p>
<br>
<h2>Dizideki 18 Sayısının Case Durumu</h2>
<br>
<p>[ 2,6,16<b>18</b>,22,27 ]<br>
Bu dizideki 18 sayısı <b>average case</b> kapsamına girer.<br>
</p>
<br>
<h2>[ 7,3,5,8,2,9,4,15,6 ] Dizisinin Insertion Sort'a Göre İlk 4 Adımı</h2>
<br>
<p>
[ <b>7</b>,3,5,8,2,9,4,15,6 ]<br>
[ <b>3,7</b>,5,8,2,9,4,15,6 ]<br>
[ <b>3,5,7</b>,8,2,9,4,15,6 ]<br>
[ <b>3,5,7,8</b>,2,9,4,15,6 ]<br>
</p>
<br>
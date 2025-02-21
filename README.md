# ÅSSF IPSC ELO ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser. Hit factor is disregarded except for determining a winner and a loser.

Shooters start with an ELO rank of 1000. K-factor is fixed at 25.

<details>
<summary>Example</summary>

Stage result with N=4 shooters:

1. Alfred
2. Björn
3. Calle
4. Daniel

This results in N-1 encounter per participant.

- Alfred won against Björn
- Alfred won against Calle
- Alfred won against Daniel
- Björn won against Calle
- Björn won against Daniel
- Calle won against Daniel

With regards to the scoring each encounter is counted as a match.
</details>

#### Compile & run
```
$ javac -cp lib/*.jar -d target/classes src/*.java
$ java -cp "lib/*;target/classes" Main
```

## Ranking
```
Loaded 50 handgun stages
Loaded 30 mini_rifle stages
Loaded 34 pcc stages
Loaded 28 rifle stages
Loaded 0 shotgun stages

1v1 encounters: 4163
1v1 ignored encounters (shared last place at HF 0): 64

Processed in 169 ms
```

### Handgun Classic
<details>
<summary>Hidden</summary>

1. A. Svensson (1066)
1. F. Andersson (935)
</details>

### Handgun Open
<details>
<summary>Hidden</summary>

1. T. Mörn (1046)
1. T. Nordqvist (955)
</details>

### Handgun Production
<details>
<summary>Hidden</summary>

1. J. Lindholm (1461)
1. E. Pettersson (1349)
1. J. Lindén (1328)
1. T. Nordqvist (1257)
1. N. Granlund (1217)
1. P. Heimdahl (1179)
1. G. Mörn (1176)
1. J. Back (1125)
1. S. Welin (1111)
1. A. Häger (1034)
1. J. Fyrqvist (1025)
1. D. Källroos (1013)
1. A. Norkvist (1010)
1. T. Mörn (967)
1. J. Welin (957)
1. N. Häggblom (939)
1. L. Pettersson (939)
1. A. Svensson (938)
1. D. Gustafsson (931)
1. F. Andersson (929)
1. F. Degerth (890)
1. M. Stenroos (867)
1. T. Stjernlöf (833)
1. P. Sundblom (829)
1. P. Jansson (801)
1. M. Nilsson (779)
1. L. Heinola (755)
1. S. Stenroos (746)
1. D. Back (690)
</details>

### Handgun Production Optics
<details>
<summary>Hidden</summary>

1. T. Bonn (1209)
1. J. Lindholm (1139)
1. E. Pettersson (1085)
1. S. Welin (981)
1. J. Back (958)
1. T. Dahlman (934)
1. N. Öberg (857)
1. D. Back (842)
</details>

### Handgun Standard
<details>
<summary>Hidden</summary>

1. T. Mörn (1206)
1. P. Heimdahl (1202)
1. J. Lindén (1200)
1. D. Källroos (1184)
1. T. Bonn (1132)
1. N. Öberg (1092)
1. S. Stenroos (1077)
1. A. Norkvist (1059)
1. T. Berlin (1003)
1. L. Pettersson (1000)
1. A. Rothberg (996)
1. D. Eklund (985)
1. J. Welin (956)
1. G. Mörn (939)
1. T. Nordqvist (931)
1. R. Eriksson (894)
1. P. Sundblom (807)
1. B. Granlund (803)
1. P. Jansson (798)
1. L. Heinola (767)
</details>

### Mini Rifle Open
<details>
<summary>Hidden</summary>

1. J. Lindén (1383)
1. S. Welin (1240)
1. J. Welin (1115)
1. T. Mörn (1113)
1. N. Granlund (1088)
1. A. Svensson (1034)
1. P. Heimdahl (1032)
1. F. Andersson (1031)
1. P. Sundblom (1027)
1. D. Back (974)
1. T. Dahlman (933)
1. L. Heinola (818)
1. A. Norkvist (801)
1. D. Gustafson (777)
1. B. Granlund (670)
</details>

### Mini Rifle Standard
### PCC Iron
### PCC Optics
<details>
<summary>Hidden</summary>

1. G. Mörn (1259)
1. J. Lindén (1235)
1. T. Bonn (1212)
1. T. Mörn (1169)
1. D. Källroos (1128)
1. E. Pettersson (1118)
1. J. Lindblom (1011)
1. S. Welin (1006)
1. N. Öberg (990)
1. P. Heimdahl (935)
1. F. Andersson (909)
1. A. Norkvist (900)
1. P. Jansson (877)
1. L. Heinola (853)
1. A. Svensson (822)
1. B. Gustafsson (820)
1. N. Häggblom (791)
</details>

### Rifle Manual Action Bolt
### Rifle Manual Action Contemporary
### Rifle Semi Auto Open
<details>
<summary>Hidden</summary>

1. S. Welin (1431)
1. T. Mörn (1415)
1. N. Öberg (1218)
1. J. Lindholm (1184)
1. A. Häger (1179)
1. S. Stenroos (1178)
1. P. Heimdahl (1074)
1. G. Mörn (1056)
1. T. Bonn (1030)
1. J. Welin (1021)
1. J. Lindén (1002)
1. A. Svensson (979)
1. J. Back (977)
1. J. Fyrqvist (974)
1. D. Back (959)
1. A. Norkvist (941)
1. N. Häggblom (905)
1. N. Granlund (889)
1. J. Grönqvist (888)
1. G. Gottberg (852)
1. B. Granlund (817)
1. P. Jansson (752)
1. P. Sundblom (665)
1. F. Andersson (664)
</details>

### Rifle Semi Auto Standard
<details>
<summary>Hidden</summary>

1. S. Cederberg (1135)
1. J. Lindén (1007)
1. D. Gustafson (996)
1. P. Heimdahl (993)
1. L. Heinola (982)
1. S. Stenroos (891)
</details>

### Shotgun Modified
### Shotgun Open
### Shotgun Standard
### Shotgun Standard Manual

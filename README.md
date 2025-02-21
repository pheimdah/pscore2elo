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
$ javac -cp lib/* -d target/classes src/*.java
$ java -cp lib/*;target/classes Main
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

Processed in 162 ms
```

### Handgun Classic
<details>
<summary>Hidden</summary>

1. A. Svensson (ELO rating of 1066 based on 16 stages)
1. F. Andersson (ELO rating of 935 based on 16 stages)
</details>

### Handgun Open
<details>
<summary>Hidden</summary>

1. T. Mörn (ELO rating of 1046 based on 4 stages)
1. T. Nordqvist (ELO rating of 955 based on 4 stages)
</details>

### Handgun Production
<details>
<summary>Hidden</summary>

1. J. Lindholm (ELO rating of 1461 based on 84 stages)
1. E. Pettersson (ELO rating of 1349 based on 132 stages)
1. J. Lindén (ELO rating of 1328 based on 62 stages)
1. T. Nordqvist (ELO rating of 1257 based on 49 stages)
1. N. Granlund (ELO rating of 1217 based on 28 stages)
1. P. Heimdahl (ELO rating of 1179 based on 223 stages)
1. G. Mörn (ELO rating of 1176 based on 143 stages)
1. J. Back (ELO rating of 1125 based on 84 stages)
1. S. Welin (ELO rating of 1111 based on 132 stages)
1. A. Häger (ELO rating of 1034 based on 24 stages)
1. J. Fyrqvist (ELO rating of 1025 based on 108 stages)
1. D. Källroos (ELO rating of 1013 based on 100 stages)
1. A. Norkvist (ELO rating of 1010 based on 48 stages)
1. T. Mörn (ELO rating of 967 based on 84 stages)
1. J. Welin (ELO rating of 957 based on 164 stages)
1. N. Häggblom (ELO rating of 939 based on 103 stages)
1. L. Pettersson (ELO rating of 939 based on 84 stages)
1. A. Svensson (ELO rating of 938 based on 25 stages)
1. D. Gustafsson (ELO rating of 931 based on 6 stages)
1. F. Andersson (ELO rating of 929 based on 12 stages)
1. F. Degerth (ELO rating of 890 based on 48 stages)
1. M. Stenroos (ELO rating of 867 based on 16 stages)
1. T. Stjernlöf (ELO rating of 833 based on 24 stages)
1. P. Sundblom (ELO rating of 829 based on 84 stages)
1. P. Jansson (ELO rating of 801 based on 121 stages)
1. M. Nilsson (ELO rating of 779 based on 24 stages)
1. L. Heinola (ELO rating of 755 based on 48 stages)
1. S. Stenroos (ELO rating of 746 based on 84 stages)
1. D. Back (ELO rating of 690 based on 84 stages)
</details>

### Handgun Production Optics
<details>
<summary>Hidden</summary>

1. T. Bonn (ELO rating of 1209 based on 54 stages)
1. J. Lindholm (ELO rating of 1139 based on 26 stages)
1. E. Pettersson (ELO rating of 1085 based on 24 stages)
1. S. Welin (ELO rating of 981 based on 34 stages)
1. J. Back (ELO rating of 958 based on 38 stages)
1. T. Dahlman (ELO rating of 934 based on 8 stages)
1. N. Öberg (ELO rating of 857 based on 23 stages)
1. D. Back (ELO rating of 842 based on 61 stages)
</details>

### Handgun Standard
<details>
<summary>Hidden</summary>

1. T. Mörn (ELO rating of 1206 based on 127 stages)
1. P. Heimdahl (ELO rating of 1202 based on 92 stages)
1. J. Lindén (ELO rating of 1200 based on 38 stages)
1. D. Källroos (ELO rating of 1184 based on 38 stages)
1. T. Bonn (ELO rating of 1132 based on 8 stages)
1. N. Öberg (ELO rating of 1092 based on 24 stages)
1. S. Stenroos (ELO rating of 1077 based on 124 stages)
1. A. Norkvist (ELO rating of 1059 based on 11 stages)
1. T. Berlin (ELO rating of 1003 based on 12 stages)
1. L. Pettersson (ELO rating of 1000 based on 54 stages)
1. A. Rothberg (ELO rating of 996 based on 41 stages)
1. D. Eklund (ELO rating of 985 based on 36 stages)
1. J. Welin (ELO rating of 956 based on 54 stages)
1. G. Mörn (ELO rating of 939 based on 95 stages)
1. T. Nordqvist (ELO rating of 931 based on 100 stages)
1. R. Eriksson (ELO rating of 894 based on 24 stages)
1. P. Sundblom (ELO rating of 807 based on 54 stages)
1. B. Granlund (ELO rating of 803 based on 54 stages)
1. P. Jansson (ELO rating of 798 based on 32 stages)
1. L. Heinola (ELO rating of 767 based on 76 stages)
</details>

### Mini Rifle Open
<details>
<summary>Hidden</summary>

1. J. Lindén (ELO rating of 1383 based on 114 stages)
1. S. Welin (ELO rating of 1240 based on 99 stages)
1. J. Welin (ELO rating of 1115 based on 134 stages)
1. T. Mörn (ELO rating of 1113 based on 151 stages)
1. N. Granlund (ELO rating of 1088 based on 9 stages)
1. A. Svensson (ELO rating of 1034 based on 123 stages)
1. P. Heimdahl (ELO rating of 1032 based on 54 stages)
1. F. Andersson (ELO rating of 1031 based on 112 stages)
1. P. Sundblom (ELO rating of 1027 based on 40 stages)
1. D. Back (ELO rating of 974 based on 32 stages)
1. T. Dahlman (ELO rating of 933 based on 56 stages)
1. L. Heinola (ELO rating of 818 based on 54 stages)
1. A. Norkvist (ELO rating of 801 based on 54 stages)
1. D. Gustafson (ELO rating of 777 based on 70 stages)
1. B. Granlund (ELO rating of 670 based on 72 stages)
</details>

### Mini Rifle Standard
### PCC Iron
### PCC Optics
<details>
<summary>Hidden</summary>

1. G. Mörn (ELO rating of 1259 based on 142 stages)
1. J. Lindén (ELO rating of 1235 based on 37 stages)
1. T. Bonn (ELO rating of 1212 based on 33 stages)
1. T. Mörn (ELO rating of 1169 based on 117 stages)
1. D. Källroos (ELO rating of 1128 based on 28 stages)
1. E. Pettersson (ELO rating of 1118 based on 15 stages)
1. J. Lindblom (ELO rating of 1011 based on 6 stages)
1. S. Welin (ELO rating of 1006 based on 42 stages)
1. N. Öberg (ELO rating of 990 based on 70 stages)
1. P. Heimdahl (ELO rating of 935 based on 112 stages)
1. F. Andersson (ELO rating of 909 based on 76 stages)
1. A. Norkvist (ELO rating of 900 based on 42 stages)
1. P. Jansson (ELO rating of 877 based on 24 stages)
1. L. Heinola (ELO rating of 853 based on 88 stages)
1. A. Svensson (ELO rating of 822 based on 52 stages)
1. B. Gustafsson (ELO rating of 820 based on 42 stages)
1. N. Häggblom (ELO rating of 791 based on 24 stages)
</details>

### Rifle Manual Action Bolt
### Rifle Manual Action Contemporary
### Rifle Semi Auto Open
<details>
<summary>Hidden</summary>

1. S. Welin (ELO rating of 1431 based on 152 stages)
1. T. Mörn (ELO rating of 1415 based on 206 stages)
1. N. Öberg (ELO rating of 1218 based on 144 stages)
1. J. Lindholm (ELO rating of 1184 based on 28 stages)
1. A. Häger (ELO rating of 1179 based on 86 stages)
1. S. Stenroos (ELO rating of 1178 based on 51 stages)
1. P. Heimdahl (ELO rating of 1074 based on 132 stages)
1. G. Mörn (ELO rating of 1056 based on 71 stages)
1. T. Bonn (ELO rating of 1030 based on 24 stages)
1. J. Welin (ELO rating of 1021 based on 206 stages)
1. J. Lindén (ELO rating of 1002 based on 155 stages)
1. A. Svensson (ELO rating of 979 based on 30 stages)
1. J. Back (ELO rating of 977 based on 126 stages)
1. J. Fyrqvist (ELO rating of 974 based on 89 stages)
1. D. Back (ELO rating of 959 based on 85 stages)
1. A. Norkvist (ELO rating of 941 based on 81 stages)
1. N. Häggblom (ELO rating of 905 based on 86 stages)
1. N. Granlund (ELO rating of 889 based on 22 stages)
1. J. Grönqvist (ELO rating of 888 based on 177 stages)
1. G. Gottberg (ELO rating of 852 based on 28 stages)
1. B. Granlund (ELO rating of 817 based on 105 stages)
1. P. Jansson (ELO rating of 752 based on 149 stages)
1. P. Sundblom (ELO rating of 665 based on 130 stages)
1. F. Andersson (ELO rating of 664 based on 97 stages)
</details>

### Rifle Semi Auto Standard
<details>
<summary>Hidden</summary>

1. S. Cederberg (ELO rating of 1135 based on 34 stages)
1. J. Lindén (ELO rating of 1007 based on 23 stages)
1. D. Gustafson (ELO rating of 996 based on 6 stages)
1. P. Heimdahl (ELO rating of 993 based on 29 stages)
1. L. Heinola (ELO rating of 982 based on 4 stages)
1. S. Stenroos (ELO rating of 891 based on 16 stages)
</details>

### Shotgun Modified
### Shotgun Open
### Shotgun Standard
### Shotgun Standard Manual

# ÅSSF IPSC ELO ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser. Hit factor is disregarded except for determining a winner and a loser.

Shooters start with an ELO rank of 1000.

## Example
<details>
<summary>Hidden</summary>

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

This also means that a DQ has an enormous effect. Given a match with 10 shooters and 5 stages a DQ will result in (9 opponents * 5 stages) = 45 individual losses for the affected shooter.

</details>

## Ranking
```
Loaded 50 handgun stages
Loaded 30 mini_rifle stages
Loaded 34 pcc stages
Loaded 28 rifle stages
Loaded 0 shotgun stages

Handgun Classic             [Fredrik A (935), Anders S (1066)]
Handgun Open                [Tommy N (955), Tomas M (1046)]
Handgun Production          [Jonas L (590), Daniela B (721), Linda H (764), Samuel S (781), Morgan N (782), Philip J (826), Tony S (836), Peter S (865), Marianne S (867), Dan G (870), Frank D (898), Fredrik A (906), Anders S (938), Nils H (939), Nils H (953), Jan W (968), Linus P (969), Jonas F (984), Tomas M (998), Alexander N (1018), Patrik H (1034), Andreas H (1038), Dennis K (1039), Jonas F (1046), Gustav M (1118), Simon W (1122), Jonas B (1148), Patrik H (1182), Nick G (1190), Tommy N (1256), Gustav M (1273), Jonas L (1335), Emil P (1362), John L (1480)]
Handgun Production Optics   [Daniela B (862), Nicklas Ö (876), Tobias D (934), Jonas B (958), Nicklas Ö (965), Simon W (981), Jonas F (1036), Emil P (1085), John L (1100), Tobias B (1209)]
Handgun Standard            [Linda H (750), Brage G (788), Peter S (789), Philip J (798), Tommy N (894), Richard E (894), Gustav M (918), Jan W (940), Dimi E (983), Linus P (985), Dimi E (998), Tomas B (1005), Alexander R (1022), Alexander N (1062), Samuel S (1063), Nicklas Ö (1092), Gustav M (1115), Tobias B (1131), Patrik H (1189), Tomas M (1195), Dennis K (1206), Jonas L (1221)]
Mini Rifle Open             [Brage G (717), Jarkko K (745), Dan G (748), Alexander N (788), Linda H (806), Tobias D (941), Tomas M (999), Daniela B (1003), Fredrik A (1012), Anders S (1021), Patrik H (1023), Peter S (1050), Tomas M (1056), Nick G (1083), Jan W (1101), Tomas M (1104), Simon W (1234), Jonas L (1248), Jonas L (1364)]
Mini Rifle Standard         []
PCC Iron                    []
PCC Optics                  [Nils H (796), Anders S (822), Benny G (836), Linda H (869), Philip J (883), Fredrik A (914), Alexander N (916), Patrik H (919), Nicklas Ö (925), Patrik H (955), John L (1011), Niclas Ö (1020), Simon W (1024), Emil P (1118), Dennis K (1128), Tomas M (1180), Tobias B (1217), Jonas L (1238), Gustav M (1271)]
Rifle Manual Action Bolt    []
Rifle Manual Action Contemporary[]
Rifle Semi Auto Open        [Fredrik A (551), Linda H (576), Brage G (720), Peter S (755), Jonathan G (838), Emil P (841), Jarkko K (841), Philip J (848), Gustav G (886), Philip J (888), Nick G (915), Jonas F (924), Niklas Ö (973), Anders S (984), Jonathan G (990), Nils H (994), Alexander N (1021), Jonas B (1025), Daniela B (1031), Jonas L (1057), Jan W (1089), Gustav M (1096), Tobias B (1105), Tomas M (1120), Patrik H (1130), Samuel S (1200), John L (1209), Andreas H (1238), Nicklas Ö (1291), Tomas M (1462), Simon W (1481)]
Rifle Semi Auto Standard    [Samuel S (887), Linda H (982), Patrik H (987), Jonas L (992), Dan G (996), Jonas L (1030), Sebastian C (1130)]
Shotgun Modified            []
Shotgun Open                []
Shotgun Standard            []
Shotgun Standard Manual     []

1v1 encounters: 4636
1v1 ignored encounters (shared last place at HF 0): 123

```

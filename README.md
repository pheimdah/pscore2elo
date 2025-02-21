# ÅSSF IPSC ELO ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser.

Shooters start the season with 1000 ELO rank.

## Example

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

## 2024 season result
```
Loaded 19 handgun stages
Loaded 23 mini_rifle stages
Loaded 14 pcc stages
Loaded 18 rifle stages
Loaded 0 shotgun stages

Handgun Classic             [Fredrik A (947), Anders S (1054)]
Handgun Open                []
Handgun Production          [Linda H (735), Tony S (821), Frank D (869), Nils H (902), Jan W (921), Philip J (955), Nils H (980), Alexander N (987), Andreas H (1022), Jonas F (1032), Patrik H (1092), Simon W (1098), Tommy N (1129), Emil P (1221), Jonas L (1278)]
Handgun Production Optics   [Daniela B (854), Nicklas Ö (949), Jonas B (962), Nicklas Ö (965), Simon W (999), Jonas F (1036), Emil P (1040), John L (1051), Tobias B (1155)]
Handgun Standard            [Linda H (782), Brage G (818), Peter S (819), Gustav M (945), Tommy N (953), Jan W (970), Dimi E (1002), Tomas B (1008), Linus P (1014), Alexander N (1065), Samuel S (1156), Patrik H (1216), Tomas M (1295)]
Mini Rifle Open             [Dan G (750), Brage G (758), Alexander N (789), Linda H (805), Tobias D (981), Daniela B (1004), Peter S (1013), Fredrik A (1014), Patrik H (1018), Anders S (1025), Nick G (1092), Jan W (1102), Tomas M (1103), Simon W (1218), Jonas L (1346)]
Mini Rifle Standard         []
PCC Iron                    []
PCC Optics                  [Benny G (857), Patrik H (897), Anders S (897), Linda H (924), Alexander N (938), Fredrik A (944), Niclas Ö (1040), Simon W (1042), Jonas L (1075), Tomas M (1118), Gustav M (1289)]
Rifle Manual Action Bolt    []
Rifle Manual Action Contemporary[]
Rifle Semi Auto Open        [Fredrik A (558), Linda H (576), Brage G (722), Peter S (755), Philip J (850), Jonathan G (866), Philip J (890), Nick G (903), Jonas F (923), Anders S (983), Jonathan G (990), Nils H (993), Alexander N (1020), Jonas B (1023), Daniela B (1029), Jonas L (1055), Jan W (1083), Gustav M (1099), Patrik H (1127), Samuel S (1195), Andreas H (1236), Nicklas Ö (1290), Tomas M (1454), Simon W (1476)]
Rifle Semi Auto Standard    [Linda H (976), Dan G (977), Patrik H (1003), Sebastian C (1048)]
Shotgun Modified            []
Shotgun Open                []
Shotgun Standard            []
Shotgun Standard Manual     []

1v1 encounters: 2680
1v1 ignored encounters (shared last place at HF 0): 65

```

## 2025 season results
```
Loaded 4 handgun stages
Loaded 0 mini_rifle stages
Loaded 4 pcc stages
Loaded 0 rifle stages
Loaded 0 shotgun stages

Handgun Classic             []
Handgun Open                []
Handgun Production          [Morgan N (795), Dan G (876), Anders S (948), Philip J (961), Nils H (973), Gustav M (1126), Patrik H (1146), Tommy N (1202)]
Handgun Production Optics   [Nicklas Ö (938), Daniela B (1023), John L (1042)]
Handgun Standard            [Samuel S (937), Tomas M (979), Tobias B (1087)]
Mini Rifle Open             []
Mini Rifle Standard         []
PCC Iron                    []
PCC Optics                  [Nils H (789), Philip J (873), Fredrik A (935), Patrik H (988), Tomas M (1125), Gustav M (1132), Tobias B (1179)]
Rifle Manual Action Bolt    []
Rifle Manual Action Contemporary[]
Rifle Semi Auto Open        []
Rifle Semi Auto Standard    []
Shotgun Modified            []
Shotgun Open                []
Shotgun Standard            []
Shotgun Standard Manual     []

1v1 encounters: 204
1v1 ignored encounters (shared last place at HF 0): 7
```

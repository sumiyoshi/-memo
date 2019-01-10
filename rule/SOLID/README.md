# S.O.L.I.D

## S - 単一責任の原則 (Single Responsibility Principle)

```
クラスはただ一つの理由(アクター)で変更されなければならない。
```

## O - オープン・クローズドの原則 (Open/closed principle)

```
ソフトウェアの構成要素は拡張に対しては開いていなければならず、修正に対しては閉じていなければならない。
```

## L - リスコフ置換原則 (Liskov substitution principle)

```
AはBを使っていて、そのBをCに置き換えた際にAの振る舞いが変わらない場合、CはBの派生形である。
```

## I - インタフェース分離の原則 (Interface segregation principle)

```
利用者が使用しないメソッドへの依存を強制してはならない。
```

## D - 依存性逆転の原則 (Dependency inversion principle)

```
ソースコードの依存関係が抽象だけを参照している状態が望ましい。
```
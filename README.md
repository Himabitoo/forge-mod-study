<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/src/main/resources/assets/studymod/textures/item/raw_thunder_diamond_ICON.png" alt="Logo" width="200"></p>
<h1 align="center">StudyMod</h1>
<p>覚えたこと、メモしたいことを都度ここに書き込みます。</p>

## command of make jar file
### Windows
````java:Windows
gradlew build
````
### another
````java:Windows
./gradlew build
````

## MOD REGISTER方法
主に2通り存在する。
ただし、ここではDeferredRegisterを使用する
- DeferredRegister
- RegisterEvent


## Diary

## 2023/03/27
    アイテムの見た目を少し変更 / edited the texture of StudyMod items.
<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-03-27_img1.png" alt="Logo"></p>
<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-03-27_img2.png" alt="Logo"></p>

## 2023/03/28
    追加したアイテムが出てくる鉱石の追加 / add new block.
<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-03-28_img1.png" alt="Logo"></p>
    
    ブロックの置いた時の音などオプション設定も行った

<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-03-28_img2.png" alt="Logo"></p>

## 2023/03/29
### ブロックは破壊時のアイテムドロップ、などなど
    
````json:json
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "studymod:raw_thunder_diamond"
        }
      ]
    }
  ]
}
````
    
<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-03-29.png" alt="Logo"></p>


## 2023/04/06

### thunder_diamondを使ったクラフト規則を追加

    "key"は特定の文字をitemとして設定ができるため便利
    "key": {
    "#": {
      "item": "studymod:thunder_diamond"
    }

    "pattern"は3x3


````json:json
{
  "type": "minecraft:crafting_shaped",
  "category": "misc",
  "key": {
    "#": {
      "item": "studymod:thunder_diamond"
    }
  },
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "result": {
    "item": "studymod:deepslate_thunder_diamond_ore"
  }
}
````

<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-04-06_img2.png" alt="Logo"></p>

### raw_thunder_diamondを使った焼き規則を追加
    
````json
{
  "type": "minecraft:smelting",
  "cookingtime": 200,
  "experience": 0.7,
  "ingredient": {
    "item": "studymod:raw_thunder_diamond"
  },
  "result": {
    "item": "studymod:thunder_diamond"
  }
}
````
<p align="center"><img src="https://raw.githubusercontent.com/Himabitoo/forge-mod-study/main/diary/img/2023-04-06_img1.png" alt="Logo"></p>

## 2023/04/10

### 追加したMODアイテム、ブロックの詳細設定、管理を行うクラスの作成

ItemModelBuilderはアイテムのモデルを構築するためのAPI</br>
これをすることでresource内でjsonファイルを生成してくれてアイテム、ブロックがどのように表示されるかの設定、定義ができる。

````java

public class ModItemModelProvider extends ItemModelProvider {

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(Item.getId(), getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StudyMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
````

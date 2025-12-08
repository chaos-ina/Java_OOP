# VS Code でのJavaビルド・実行方法（macOS）

## 概要

macOSでVS Codeを使用してJavaプログラムをビルド・実行する設定が完了しました。

## 使い方

### 基本的な使い方

1. **Javaファイルを開く**
   - VS Codeで実行したいJavaファイル（例：`DriveCar1.java`）を開きます

2. **ビルド＆実行**
   - **キーボードショートカット**: `Cmd+Shift+B` (macOS) / `Ctrl+Shift+B` (Windows)
   - または、メニューから：`Terminal` → `Run Build Task...`

3. **結果の確認**
   - VS Codeのターミナルパネルにコンパイル結果と実行結果が表示されます

### どのように動作するか

このビルドタスクは以下の処理を自動的に行います：

1. **パッケージ名の自動認識**
   - ファイルのディレクトリ構造からパッケージ名を自動計算
   - 例：`OOP_basic/prob1/DriveCar1.java` → パッケージ名 `OOP_basic.prob1`

2. **コンパイル**
   - 同じディレクトリ内のすべての`.java`ファイルをコンパイル
   - UTF-8エンコーディングで処理（日本語コメントにも対応）

3. **自動実行**
   - コンパイルが成功した場合のみ、プログラムを自動実行
   - エラーがある場合は実行せず、エラーメッセージを表示

## 実行例

`DriveCar1.java`を開いて`Cmd+Shift+B`を押すと：

```
Compiling files in: OOP_basic/prob1
Package name: OOP_basic.prob1
Main class: OOP_basic.prob1.DriveCar1

Compilation successful. Running OOP_basic.prob1.DriveCar1...
----------------------------------------
no = 2525
speed = 60
no = 2525
speed = 40
no = 2525
speed = 0
```

## トラブルシューティング

### ビルドタスクが実行されない場合

1. **スクリプトの実行権限を確認**

   ```bash
   chmod +x .vscode/build-and-run.sh
   ```

2. **VS Codeをリロード**
   - `Cmd+Shift+P` → `Developer: Reload Window`

### コンパイルエラーが出る場合

- エラーメッセージをよく読んで、Javaコードの文法エラーを修正してください
- `Car1.java`など、依存するクラスが同じディレクトリにあることを確認してください

### 手動でビルド・実行したい場合

プロジェクトのルートディレクトリ（`Java_OOP`）で以下のコマンドを実行：

```bash
# コンパイル
javac -encoding UTF-8 -sourcepath . OOP_basic/prob1/*.java

# 実行
java -cp . OOP_basic.prob1.DriveCar1
```

## 技術詳細

### 関連ファイル

- **`.vscode/tasks.json`**: VS Codeのタスク設定
- **`.vscode/build-and-run.sh`**: macOS/Linux用のビルドスクリプト
- **`.vscode/build-and-run.ps1`**: Windows用のビルドスクリプト（参考用）

### クロスプラットフォーム対応

このプロジェクトは、Windows（PowerShell）とmacOS/Linux（bash）の両方に対応しています。
VS Codeが自動的に適切なスクリプトを選択して実行します。

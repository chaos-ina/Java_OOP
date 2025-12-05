#!/bin/bash
# Javaのパッケージファイルをコンパイルして実行するスクリプト
# 引数: $1 = 相対ファイルディレクトリ, $2 = ファイルベース名（拡張子なし）

relativeDir="$1"
fileBaseName="$2"

# パッケージ名を計算（フォルダのパスを '.' で区切った名前に変換）
packageName="${relativeDir//\//.}"

echo "Compiling files in: $relativeDir"
echo "Package name: $packageName"
echo "Main class: $packageName.$fileBaseName"
echo ""

# コンパイル
javac -encoding UTF-8 -sourcepath . "$relativeDir"/*.java

# コンパイルが成功したら実行
if [ $? -eq 0 ]; then
    echo ""
    echo "Compilation successful. Running $packageName.$fileBaseName..."
    echo "----------------------------------------"
    java -cp . "$packageName.$fileBaseName"
else
    echo "Compilation failed."
    exit 1
fi

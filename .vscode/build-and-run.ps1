# Javaのパッケージファイルをコンパイルして実行するスクリプト
# 引数: $1 = 相対ファイルディレクトリ, $2 = ファイルベース名（拡張子なし）

param(
    [string]$relativeDir,
    [string]$fileBaseName
)

# パッケージ名を計算（フォルダのパスを '.' で区切った名前に変換）
$packageName = $relativeDir -replace "\\", "."

Write-Host "Compiling files in: $relativeDir"
Write-Host "Package name: $packageName"
Write-Host "Main class: $packageName.$fileBaseName"
Write-Host ""

# コンパイル
javac -encoding UTF-8 -sourcepath . "$relativeDir\*.java"

# コンパイルが成功したら実行
if ($LASTEXITCODE -eq 0) {
    Write-Host ""
    Write-Host "Compilation successful. Running $packageName.$fileBaseName..."
    Write-Host "----------------------------------------"
    java -cp . "$packageName.$fileBaseName"
} else {
    Write-Host "Compilation failed."
    exit 1
}

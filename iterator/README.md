### iteratorパターン

- 繰り返しや反復を行うときに使うパターン。普通のforで済む時もある。
- サンプルコードでは、客が待ち状態かどうかも含めて「次の待機客」を取得しようとしている。呼び出し側で待機客のオブジェクトを引き当てるまでループしなくてもいいようにイテレータパターンを使用。
- つまり、次の値を取得する場合などに、独自のルールで値を取得したい場合などに使える。
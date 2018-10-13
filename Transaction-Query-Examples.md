# CRYPTO CREATE ACCOUNT

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538675158
      nanos: 77615000
    }
    accountID {
      accountNum: 1
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "Demo memo"
  cryptoCreateAccount {
    key {
      ed25519: "U\243\305d\311\006,/\376\342\274m\325e\026I\260r\262\256\345\353r\245z\374k\n\025%\221\241"
    }
    initialBalance: 10000
    autoRenewPeriod {
      seconds: 2592000
    }
  }
}
sigs {
  sigs {
    ed25519: "\336\354,&l\v\237\203N\217N\034\363\'S\n\212\021:\022r &\373\212\330\204\206\f \315\276\336\v\376M\222\241\265\375\360\343\025\353\\\361u\251#-2T\265\005\340\314\212\255\266&]\345\203\v"
  }
}
```

# Get Receipt

```
transactionGetReceipt {
  header {
  }
  transactionID {
    transactionValidStart {
      seconds: 1538675158
      nanos: 77615000
    }
    accountID {
      accountNum: 1
    }
  }
}
```

# Get Receipt response
```
transactionGetReceipt {
  header {
    cost: 2
  }
  receipt {
  }
}
```

# Get Receipt response
```
transactionGetReceipt {
  header {
    cost: 2
  }
  receipt {
    status: SUCCESS
    accountID {
      accountNum: 1060
    }
  }
}
```

# Get Receipt response
```
transactionGetReceipt {
  header {
    nodeTransactionPrecheckCode: INVALID_TRANSACTION
    cost: 2
  }
}
```

# Get Transaction Record
```
transactionGetRecord {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538675161
            nanos: 749497000
          }
          accountID {
            accountNum: 1
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "Demo memo"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: "\220m\227\347\354NS\330<\0330\002\3778\270\204E?\307\337(\230\205\346\241\250\314\277\213\332o~\3308\324\363\315o\355):\210e.\022\236\223\240\0202\270F/4\305\au\\\304~_%\223\016"
        }
        sigs {
          ed25519: "\220m\227\347\354NS\330<\0330\002\3778\270\204E?\307\337(\230\205\346\241\250\314\277\213\332o~\3308\324\363\315o\355):\210e.\022\236\223\240\0202\270F/4\305\au\\\304~_%\223\016"
        }
      }
    }
  }
  transactionID {
    transactionValidStart {
      seconds: 1538675158
      nanos: 77615000
    }
    accountID {
      accountNum: 1
    }
  }
}
```

# Get Transaction Record Response
```
transactionGetRecord {
  header {
    cost: 2
  }
  transactionRecord {
    receipt {
      status: SUCCESS
      accountID {
        accountNum: 1060
      }
    }
    consensusTimestamp {
      seconds: 1538675158
      nanos: 676511000
    }
    transactionID {
      transactionValidStart {
        seconds: 1538675158
        nanos: 77615000
      }
      accountID {
        accountNum: 1
      }
    }
    memo: "Demo memo"
    transactionFee: 10
  }
}
```

# Crypto Get Balance

```
cryptogetAccountBalance {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538726504
            nanos: 332518000
          }
          accountID {
            accountNum: 1038
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "Demo memo"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1038
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: ":v\'&\367\177c^c@\332\260\364\213\273\213~\360\034\324m\250O\241\363\200\b\030J\211\311\251\033\343\276\256\021\313\366B\343\r@L\337\024\242\001\256\037\332\030\252JS?s\271p\227\030\345\310\t"
        }
        sigs {
          ed25519: ":v\'&\367\177c^c@\332\260\364\213\273\213~\360\034\324m\250O\241\363\200\b\030J\211\311\251\033\343\276\256\021\313\366B\343\r@L\337\024\242\001\256\037\332\030\252JS?s\271p\227\030\345\310\t"
        }
      }
    }
  }
  accountID {
    accountNum: 1038
  }
}
```

# Crypto Get Balance Response
```
cryptogetAccountBalance {
  header {
    cost: 2
  }
  accountID {
    accountNum: 1038
  }
  balance: 10000
}
```

# Crypto Transfer
```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538726504
      nanos: 385453000
    }
    accountID {
      accountNum: 1038
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "Demo memo"
  cryptoTransfer {
    transfers {
      accountAmounts {
        accountID {
          accountNum: 1038
        }
        amount: -10
      }
      accountAmounts {
        accountID {
          accountNum: 1039
        }
        amount: 10
      }
    }
  }
}
sigs {
  sigs {
    ed25519: "Z\312yH\227\"\003\016a\022jd\274f\362h\rV\250\2534\212\245Stv\356\360n\215\255-j\177j\264Gm\333=\366\245KT\325\373^\301\274\"H++\361\302\2678\rs\2306hG\t"
  }
  sigs {
    ed25519: "Z\312yH\227\"\003\016a\022jd\274f\362h\rV\250\2534\212\245Stv\356\360n\215\255-j\177j\264Gm\333=\366\245KT\325\373^\301\274\"H++\361\302\2678\rs\2306hG\t"
  }
}
```

# Crypto Update Account
```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538675161
      nanos: 775148000
    }
    accountID {
      accountNum: 1060
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "Demo memo"
  cryptoUpdateAccount {
    accountIDToUpdate {
      accountNum: 1060
    }
    key {
      ed25519: "w\251\210\224\123\024\204.\377=\244\000\2102&`\277N#\321\202t\037\337\330\360N\361\236\340@\271"
    }
    proxyAccountID {
      accountNum: 1
    }
    proxyFraction: 2
    sendRecordThreshold: 4000
    receiveRecordThreshold: 3000
    autoRenewPeriod {
      seconds: 10
      nanos: 20
    }
    expirationTime {
      seconds: 200
      nanos: 100
    }
  }
}
sigs {
  sigs {
    ed25519: "\224D\221\373$#\360P\3567W\321\330\202\035\026c\201\022@|\242{x#\311\224\366\323\340\324\304\210\363^\377\305~\\\022<%\335.l\036\272*4\250\177K\256Fj\305\343Hh\232\036\363\207\n"
  }
  sigs {
    ed25519: "\224D\221\373$#\360P\3567W\321\330\202\035\026c\201\022@|\242{x#\311\224\366\323\340\324\304\210\363^\377\305~\\\022<%\335.l\036\272*4\250\177K\256Fj\305\343Hh\232\036\363\207\n"
  }
  sigs {
    ed25519: "\262\006\225\a\306\204\\\004\203\202QZY\002\205\323,\206\024\2568hqk\375\343.L\201\312\376\321\005\2243\261\313\232*)\266 \357\330\242\217\031\024<\213\343\304\214\321\036\261(*/\337\371PM\a"
  }
}
```

# Crypto Get Info

```
cryptoGetInfo {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538675165
            nanos: 844368000
          }
          accountID {
            accountNum: 1060
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "Demo memo"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1060
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: "V\241V\270\310[@\362\247\223C\364c\364\026cO\230\313\204>R\210\a\023G6\002_\322\274\217X4;\211\350\250\001\370\306k\r\316\202\236\270\376\225\267j\200\270\032D\223l\v5\204\307\031\277\001"
        }
        sigs {
          ed25519: "V\241V\270\310[@\362\247\223C\364c\364\026cO\230\313\204>R\210\a\023G6\002_\322\274\217X4;\211\350\250\001\370\306k\r\316\202\236\270\376\225\267j\200\270\032D\223l\v5\204\307\031\277\001"
        }
      }
    }
  }
  accountID {
    accountNum: 1060
  }
}
```

# Crypto Get info Response

```
cryptoGetInfo {
  header {
    cost: 2
  }
  accountInfo {
    accountID {
      accountNum: 1060
    }
    contractAccountID: "e020758a9fe6e7af19cf8a3c75debd1837f11523"
    proxyAccountID {
    }
    proxyFraction: 2
    key {
      ed25519: "77a98894cf14842edcf3da40088322660bf4e23d182741fdfd8f04ef19ee040b9"
    }
    balance: 10000
    generateSendRecordThreshold: 4000
    generateReceiveRecordThreshold: 3000
    expirationTime {
      seconds: 200
      nanos: 100
    }
    autoRenewPeriod {
      seconds: 10
      nanos: 20
    }
  }
}
```

# File Create

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538675747
      nanos: 123604000
    }
    accountID {
      accountNum: 1061
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "File Tests"
  fileCreate {
    expirationTime {
      seconds: 1538762147
      nanos: 108871000
    }
    keys {
      keys {
        ed25519: "F\247\350\143\"!f\305\016\232\354\202\213\020\314\032g5O\\-\246\372\t\340\364\331~T.\340-"
      }
    }
    contents: "Creation contents"
  }
}
sigs {
  sigs {
    ed25519: "\307\b\277\317v\226\016/\n+{\017\344\261\346OuU[\217p\265+J\267\333\232\200\355@\310\354\a\301\326\322#\253\234\265\270\302\211\004k\365-F\243\177\245\326\264\205[\222\374i\363\274\343\240h\t"
  }
  sigs {
    signatureList {
      sigs {
        ed25519: "F\'}T\251m\v\337&V\301`6\210\335\244\351\342\201^\310r\306\207\265\351\004\343\017\241\334\324\375^\037<\263F\341S.\323\336\200\246\241\244[\263\270\314\210\244\324\365\354.Y\313%\232\372u\a"
      }
    }
  }
}
```

# File Delete

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538675753
      nanos: 218623000
    }
    accountID {
      accountNum: 1061
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "File Tests"
  fileDelete {
    fileID {
      fileNum: 1062
    }
  }
}
sigs {
  sigs {
    ed25519: "}I7N\253\211j+\366#\177\233\001\227x\255\373T\205\023\222n\224x\345p?\346\337\336\v\'WZ\246I\332\341\024\020\203\231w\265\237\323\b\227\025\336\271\234\333\261\247\t\371ae\001\020\334\333\t"
  }
  sigs {
    signatureList {
      sigs {
        ed25519: "N\351q\244+\242\215\321T\321\243\001\213q~\0371\320\337\306\276/\320\000\224\303\220\277\324\\\034N\002\234I\017\241\310\3642\344\341\221\226\a=\375\302\016\275\025x\240\177\235\037E\255\203Q\264\243\376\f"
      }
    }
  }
}
```

# File Get Info

```
fileGetInfo {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538677345
            nanos: 636126000
          }
          accountID {
            accountNum: 1063
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "File Tests"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1063
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: "\322\340,\326\372y#\340m\265}.q.\033O\345\\\300\217m\261\'\225\314\232\024J\215\353{\344v\033G\025\371\275G\304\vvh\317\257\303tom\331\326G\017\205\305t\233\"\373[\a\026C\005"
        }
        sigs {
          ed25519: "\322\340,\326\372y#\340m\265}.q.\033O\345\\\300\217m\261\'\225\314\232\024J\215\353{\344v\033G\025\371\275G\304\vvh\317\257\303tom\331\326G\017\205\305t\233\"\373[\a\026C\005"
        }
      }
    }
  }
  fileID {
    fileNum: 1064
  }
}
```

# File Get Info Response

```
fileGetInfo {
  header {
    cost: 2
  }
  fileInfo {
    fileID {
      fileNum: 1064
    }
    size: 17
    expirationTime {
      seconds: 1538763741
      nanos: 561105000
    }
    keys {
      keys {
        ed25519: "\233P\261\2155\tp-\a\244\361<\312\026\324\333i\016\245t>y5n\002g\222\263\317\303.v"
      }
    }
  }
}
```

# File Append

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538677345
      nanos: 668697000
    }
    accountID {
      accountNum: 1063
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "File Tests"
  fileAppend {
    fileID {
      fileNum: 1064
    }
    contents: "Appended contents"
  }
}
sigs {
  sigs {
    ed25519: "\374}\276-\355^\366\357\265\320\276\335h<t\204\222\370qbxU\a\233\303o\211\032\331\227PH\361\330\0017\221\373\b`l\232!\f%u\004<\253\ai*\247\200Y\3138ZysR\346\245\004"
  }
  sigs {
    signatureList {
      sigs {
        ed25519: "\a\235\340r%NK\3361\375\3779/V\362\307\234\205\274\216\322\355\277\214\347:\262\341\355\226\210\035\324\023\b\024\024\272-\301\271\0312\272cu\aU\005A/\354\214v\224\326\354\005*\370:\324\321\016"
      }
    }
  }
}
```

# File Get Contents

```
fileGetContents {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538677350
            nanos: 718802000
          }
          accountID {
            accountNum: 1063
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "File Tests"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1063
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: "sN\253\035\b[\002R\363\360\314\231!w\326\303\316\227G,\006\211\035\201I\301\262\377\360u,\234\352\342\005\305\024R\217\260A\342\306nF&\006\037b\305@\211\310:y2\025\211\352\377\362\352\340\004"
        }
        sigs {
          ed25519: "sN\253\035\b[\002R\363\360\314\231!w\326\303\316\227G,\006\211\035\201I\301\262\377\360u,\234\352\342\005\305\024R\217\260A\342\306nF&\006\037b\305@\211\310:y2\025\211\352\377\362\352\340\004"
        }
      }
    }
  }
  fileID {
    fileNum: 1064
  }
}
```

# File Get Contents Response

```
fileGetContents {
  header {
    cost: 2
  }
  fileContents {
    fileID {
      fileNum: 1064
    }
    contents: "Creation contentsAppended contents"
  }
}
```

# File Update

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538677350
      nanos: 745224000
    }
    accountID {
      accountNum: 1063
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "File Tests"
  fileUpdate {
    fileID {
      fileNum: 1064
    }
    expirationTime {
      seconds: 1538677360
      nanos: 745210002
    }
    contents: "Updated contents"
  }
}
sigs {
  sigs {
    ed25519: "\362\271\275&\337L/We\212\264\333\241\216\350\341[q5\177=\b\341\343\260\255\rJvy\254\032\367\353d\251\230mn\037\376W\311~J\200\017\302\355J\0252\324\235\b\377\352\367\"\021H\365\337\016"
  }
  sigs {
    signatureList {
      sigs {
        ed25519: "h\001/\327/DHq\362<\366\314\177\234M3\276\020\231\372\005\036%\241b\265\273T\253oU\252P\212\324\266\2274\023\034\346v\212\362\225\367@\344\235\277A\vf\276\006\034HG\302{\262S\317\v"
      }
    }
  }
}
```

# Contract Create

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538677598
      nanos: 205222000
    }
    accountID {
      accountNum: 1065
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 100
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "Demo memo"
  contractCreateInstance {
    fileID {
      fileNum: 1066
    }
    gas: 250000
    autoRenewPeriod {
      seconds: 86400
    }
    shardID {
    }
    realmID {
    }
  }
}
sigs {
  sigs {
    ed25519: "\323\004\373\307\020\224\371\373(`\v\217\221f\324\000\\X\351+D<\177\261\271^\253\030g${\251\264p\225\255\225\231\004 \031\310\365#!|3\321\004(\363\322\317\314\024\350\210\232\365\342\270\330\021\005"
  }
  sigs {
    signatureList {
      sigs {
        ed25519: "\323\004\373\307\020\224\371\373(`\v\217\221f\324\000\\X\351+D<\177\261\271^\253\030g${\251\264p\225\255\225\231\004 \031\310\365#!|3\321\004(\363\322\317\314\024\350\210\232\365\342\270\330\021\005"
      }
    }
  }
}
```

# Get receipt response

```
transactionGetReceipt {
  header {
    cost: 2
  }
  receipt {
    status: SUCCESS
    contractID {
      contractNum: 1040
    }
  }
}
```

# Contract Update

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538677876
      nanos: 698746000
    }
    accountID {
      accountNum: 1038
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "Demo memo"
  contractUpdateInstance {
    contractID {
      contractNum: 1040
    }
    expirationTime {
      seconds: 100
      nanos: 10
    }
    autoRenewPeriod {
      seconds: 10
      nanos: 20
    }
  }
}
sigs {
  sigs {
    ed25519: "\307\246\234\307\352<\352\325p5?o=\365\201\207\212\211\204\260\230\374\270~w\bN\276^-\341\'G?\330\354w)\231\005\217*8\347\260\206\027Y\352!\221\345\270I\201#\226\223\317\277:\0163\016"
  }
}
```

# Contract Get Info

```
contractGetInfo {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538677879
            nanos: 758732000
          }
          accountID {
            accountNum: 1038
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "Demo memo"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1038
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: ")\353\201Z\333b]0\246}4\366t\n;/\306\334?U\256-\230\005\017a\003cL\3671U\365\357\005s\255\264\r\016\237o\264j\033\262\221#\366\316)\210Z\303\006\211=>\302\354\032\"\354\r"
        }
        sigs {
          ed25519: ")\353\201Z\333b]0\246}4\366t\n;/\306\334?U\256-\230\005\017a\003cL\3671U\365\357\005s\255\264\r\016\237o\264j\033\262\221#\366\316)\210Z\303\006\211=>\302\354\032\"\354\r"
        }
      }
    }
  }
  contractID {
    contractNum: 1040
  }
}
```

# Contact Get Info Response

```
contractGetInfo {
  header {
    cost: 2
  }
  contractInfo {
    contractID {
      contractNum: 1040
    }
    accountID {
      accountNum: 1040
    }
    contractAccountID: "a1f32e6a59eb2fbaec2a75ce2b00f3fcd7489578"
    expirationTime {
      seconds: 100
      nanos: 10
    }
    autoRenewPeriod {
      seconds: 10
      nanos: 20
    }
    storage: 344
  }
}
```

# Contract Get ByteCode

```
contractGetBytecode {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538677879
            nanos: 790702000
          }
          accountID {
            accountNum: 1038
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "Demo memo"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1038
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: "SOO$\016e2AU\255P\356t\\\277\241\371M\201\361\332\371\312HkH\353\357\346\310$\351\305e\373\210FZol\230\314\344\005\324]\365(|\223\215\304\214\031\220\221Y\024\032\2213a\254\001"
        }
        sigs {
          ed25519: "SOO$\016e2AU\255P\356t\\\277\241\371M\201\361\332\371\312HkH\353\357\346\310$\351\305e\373\210FZol\230\314\344\005\324]\365(|\223\215\304\214\031\220\221Y\024\032\2213a\254\001"
        }
      }
    }
  }
  contractID {
    contractNum: 1040
  }
}
```

# Contract Get ByteCode Response

```
contractGetBytecodeResponse {
  header {
    cost: 2
  }
  bytecode: "```@R`\0046\020`HWc\377\377\377\377|\001\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000`\0005\004\026c`\376G\261\201\024`MW\200cmL\346<\024`bW[`\000\200\375[4\025`WW`\000\200\375[```\0045`\204V[\000[4\025`lW`\000\200\375[`r`\211V[`@Q\220\201R` \001`@Q\200\221\003\220\363[`\000UV[`\000T\220V\000\241ebzzr0X r\245\206J1\027\246\342\264\230\024\255X\255FIH\020|\204\365\354\r\260+\221\340\362jJ\017\314\000)"
}
```

# Contract Call

```
body {
  transactionID {
    transactionValidStart {
      seconds: 1538677880
      nanos: 578038000
    }
    accountID {
      accountNum: 1038
    }
  }
  nodeAccountID {
    accountNum: 2
  }
  transactionFee: 10
  transactionValidDuration {
    seconds: 120
  }
  generateRecord: true
  memo: "Demo memo"
  contractCall {
    contractID {
      contractNum: 1040
    }
    gas: 250000
    amount: 14
    functionParameters: "`\376G\261\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\n"
  }
}
sigs {
  sigs {
    ed25519: "\313\335+9+[\n\312\344\203\225Wp\307\305<\323\321k\363\374A\260\005\351\276\227U\202c]x\324\v\332\3419\3234\316\n\001)9\353\313Fh\034\002\350\241\352\025\213\223P\317\332o\001\321\321\t"
  }
  sigs {
    signatureList {
      sigs {
        ed25519: "\313\335+9+[\n\312\344\203\225Wp\307\305<\323\321k\363\374A\260\005\351\276\227U\202c]x\324\v\332\3419\3234\316\n\001)9\353\313Fh\034\002\350\241\352\025\213\223P\317\332o\001\321\321\t"
      }
    }
  }
}
```

# Contract Run Local

```
contractCallLocal {
  header {
    payment {
      body {
        transactionID {
          transactionValidStart {
            seconds: 1538677884
            nanos: 664348000
          }
          accountID {
            accountNum: 1038
          }
        }
        nodeAccountID {
          accountNum: 2
        }
        transactionFee: 10
        transactionValidDuration {
          seconds: 120
        }
        generateRecord: true
        memo: "Demo memo"
        cryptoTransfer {
          transfers {
            accountAmounts {
              accountID {
                accountNum: 1038
              }
              amount: -10
            }
            accountAmounts {
              accountID {
                accountNum: 2
              }
              amount: 10
            }
          }
        }
      }
      sigs {
        sigs {
          ed25519: "c Z\232\303!I\311\252\233}\350\372\261#\003\257M\016\037?Y\343H\220\304\314\020\376\215O\001k\202G\203\326\270\210\fh)\335\345\356\220\256\233\353\030\245\344\342I4\242\326e\201 \371\275\250\b"
        }
        sigs {
          ed25519: "c Z\232\303!I\311\252\233}\350\372\261#\003\257M\016\037?Y\343H\220\304\314\020\376\215O\001k\202G\203\326\270\210\fh)\335\345\356\220\256\233\353\030\245\344\342I4\242\326e\201 \371\275\250\b"
        }
      }
    }
  }
  contractID {
    contractNum: 1040
  }
  gas: 250000
  functionParameters: "mL\346<"
  maxResultSize: 5000
}
```

# Contract Run Local response

```
contractCallLocal {
  header {
    cost: 2
  }
  functionResult {
    contractID {
      contractNum: 1040
    }
    contractCallResult: "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\n"
  }
}
```

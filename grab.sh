#! /bin/sh
rm -rf src/main/proto/*
cp -R ../hedera-protobufs/streams/* src/main/proto/
cp -R ../hedera-protobufs/mirror/* src/main/proto/
cp -R ../hedera-protobufs/services/* src/main/proto/
cp -R ../hedera-protobufs/sdk/* src/main/proto/ || true

#!/usr/bin/env bash

apt-get update
apt-get clean
wget -qO- https://experimental.docker.com/ | sh


#!/usr/bin/env bash

wget -qO- https://experimental.docker.com/ | sh

sudo usermod -aG docker vagrant

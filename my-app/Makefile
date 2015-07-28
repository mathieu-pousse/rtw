GROUP := mpousse
NAME := my-app
VERSION := '1.0'

all: build

compile:
    mvn clean install

build: compile
    docker build -t $(GROUP)/$(NAME):$(VERSION)

tag_latest:
	docker tag $(GROUP)/$(NAME):$(VERSION) $(GROUP)/$(NAME):latest

release: tag_latest
	@if ! docker images $(GROUP)/$(NAME) | awk '{ print $$2 }' | grep -q -F $(VERSION); then echo "$(GROUP)/$(NAME) version $(VERSION) is not yet built. Please run 'make build'"; false; fi
    docker push $(GROUP)/$(NAME)

.PHONY: \
    all \
    compile \
    build \
    tag_latest \
    release

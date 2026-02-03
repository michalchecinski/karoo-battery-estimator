#!/bin/sh

# Example usage:
# ./.github/scripts/prepare-manifest.sh 1.0.0 123 release-notes.txt

set -e

echo "Preparing manifest..."

cp manifest-template.json manifest.json

# replace __VERSION_NUMBER_PLACEHOLDER__ with the actual version from input
VERSION=${1}
sed "s/__VERSION_NUMBER_PLACEHOLDER__/${VERSION}/g" manifest.json > manifest.json.tmp && mv manifest.json.tmp manifest.json

# __VERSION_CODE_PLACEHOLDER__
sed "s/__VERSION_CODE_PLACEHOLDER__/${2}/g" manifest.json > manifest.json.tmp && mv manifest.json.tmp manifest.json

# __RELEASE_NOTES_PLACEHOLDER__
RELEASE_NOTES=$(cat "${3}" | sed 's/$/\\n/' | tr -d '\n' | sed 's/$/\\n/')
sed "s|__RELEASE_NOTES_PLACEHOLDER__|${RELEASE_NOTES%\\n}|g" manifest.json > manifest.json.tmp && mv manifest.json.tmp manifest.json

APK_SHA256=${4}
sed "s/__APK_SHA256_PLACEHOLDER__/${APK_SHA256}/g" manifest.json > manifest.json.tmp && mv manifest.json.tmp manifest.json

echo "Manifest prepared."
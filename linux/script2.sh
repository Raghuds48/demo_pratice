#!/bin/bash

# Variables
SOURCE_REPO_URL="https://github.com/Raghuds48/wisecow.git"  # Source repository URL
TARGET_REPO_URL="https://github.com/Raghuds48/duplicate-repo-history.git"  # Target repository URL
CLONE_DIR="repo_clone"                                        # Temporary directory for cloning

# Clone the source repository
echo "Cloning the source repository..."
git clone --bare "$SOURCE_REPO_URL" "$CLONE_DIR"

# Navigate to the cloned repository
cd "$CLONE_DIR" || { echo "Failed to enter the directory $CLONE_DIR"; exit 1; }

# Push to the target repository
echo "Pushing to the target repository..."
git rpush --mirror "$TARGET_REPO_URL"


echo "Repository copied successfully from $SOURCE_REPO_URL to $TARGET_REPO_URL"

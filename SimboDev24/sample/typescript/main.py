# coding=UTF-8

# Environment:
# - Python2.7
# - Module pipenv. Install by command "pip install pipenv"
#
# Usage:
# - Execute "python main.py" to initial all utils
# - Execute "python main.py --help" to show the help


import os
import subprocess
import sys

if os.path.exists("Pipfile"):
    cmd = []
else:
    cmd = ["pipenv install eggameini --pypi-mirror http://10.20.8.41:6688 --two"]

cmd.append("pipenv run python -m eggameini.cmd {}".format(" ".join(sys.argv[1:])))

for c in cmd:
    subprocess.check_call(c, shell=True)
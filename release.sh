#in venv
#pip install -r req.txt
pip freeze > req.txt
#git clone -o 2_matrix_test https://github.com/Kovalsky95/2_matrix_test.git
#git config --global credential.helper cache
git config --global credential.helper "cache --timeout=25200"
#git config credential.helper store
#git config --unset credential.helper
git pull --all
git add .
git commit -m PenguinL
git push --set-upstream 2_matrix_test master

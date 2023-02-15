pipeline{
    agent any
    stages {
        stage('Initializing virtual env') {
            scripts {
                bat '''
                    python -m pip install -U pip --user
                    pip install virtualenv
                    mkdir my_project
                    python -m virtualenv venv
                    venv\Scripts\activate
                    pip install pytest
                    cd ../
                    '''

            }
        }
        stage('Unitest'){
            bat '''
                pytest -v Repo1/unitests.py
             '''
        }

    }
}
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
                    '''

            }
        }
    }
}
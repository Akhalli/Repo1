pipeline{
    agent any 
    stages { 
        stage('virtual env') { 
            steps { 
                scripts {
                    bat '''
                        python -m pip install -U pip --user
                        pip install virtualenv
                        mkdir my_project1
                        python -m virtualenv venv
                        venv\Scripts\activate
                        pip install pytest
                        cd ../
                    '''
                 }
            }
        }
    }
}
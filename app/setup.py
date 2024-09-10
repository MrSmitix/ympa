# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "ympa_python_blueplanet_server"
VERSION = "24.08.29"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["connexion"]

setup(
    name=NAME,
    version=VERSION,
    description="Партнерский API Маркета",
    author_email="",
    url="",
    keywords=["Swagger", "Партнерский API Маркета"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['swagger/swagger.yaml']},
    include_package_data=True,
    entry_points={
        'console_scripts': ['ympa_python_blueplanet_server=ympa_python_blueplanet_server.__main__:main']},
    long_description="""\
    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
    """
)


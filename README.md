**Title**
Deep Learning based Smart Energy Consumption Prediction in Residential Building

**Description**
This project aims to predict hourly, daily, weekly, and monthly energy consumption prediction using the IHEPC dataset with a deep learning-based approach. The IHPEC dataset contains consumption data used for predicting and analyzing power usage patterns over time.

**Dataset Information**
This study uses the Individual Household Electric Power Consumption (IHPEC) dataset, which records minute-level measurements of a single household’s electricity usage; it is available at:
https://archive.ics.uci.edu/dataset/235/individual+household+electric+power+consumption

**Code Information**
The code performs data preprocessing, feature selection, model training, and evaluation using metrics like MAPE, RMSE, MAE, and MSE to forecast household energy consumption using the ECP-Bidirectional Long Short-Term Memory (ECP-BLSTM) model.

**Usage Instructions**
To use the dataset, download the IHPEC dataset from the UCI repository and load it using pandas. Run code in a Python environment (Google Colab) after installing the required libraries; it includes data cleaning, feature extraction, model training using ECP-BLSTM, and performance evaluation.

**Requirements**
The code requires Python along with the following libraries: pandas, numpy, matplotlib, scikit-learn, and TensorFlow (or Keras) for implementing the ECP-BLSTM model.

**Methodology**
 This project uses the IHEPC (Individual Household Electric Power Consumption) dataset to predict energy consumption on an hourly, daily, weekly, and monthly basis. 
The first two years of data are used for training, while the last two years are reserved for testing. 
A Bidirectional LSTM (BLSTM) model is employed to capture temporal dependencies in consumption patterns. 
The implementation is done using NumPy, Pandas, Matplotlib, and Seaborn for data handling, model evaluation, and visualization.

**Materials & Methods**
The code was developed and tested on a Windows 10 operating system with 12GB RAM and an Intel Core i5 processor, using Python. The code repository is available at

**Evaluation Method**
To comprehensively evaluate the performance of our proposed energy consumption prediction model, we employed several standard metrics and performed extensive experiments on publicly accessible dataset: IHEPC

**Datasets**
IHEPC Dataset: The IHEPC (Individual Household Electric Power Consumption) dataset contains over four years of minute-level measurements of electrical power usage from a single household in France, including variables such as active power, reactive power, voltage, and energy sub-metering.

**Experimental Setup**
Data Splitting: The first two years of the IHEPC dataset were used for training, while the last two years were reserved for testing to evaluate the model's performance.
Training: The BLSTM model was trained on the first two years of data to learn temporal patterns in energy consumption across different time resolution.

**Evaluation Metrics**
The following metrics were used to evaluate the performance of the models:
MAPE (Mean Absolute Percentage Error): Measures the average percentage difference between predicted and actual values.
RMSE (Root Mean Squared Error): Calculates the square root of the average squared differences between predictions and actual values, giving more weight to large errors.
MAE (Mean Absolute Error): Computes the average of absolute differences between predicted and actual values.
MSE (Mean Squared Error): Calculates the average of squared differences between predicted and actual values, highlighting error magnitude.



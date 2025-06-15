** Title Deep Learning based Smart Energy Consumption Prediction in Residential Building**

**Introduction**
This project aims to predict hourly, daily, weekly, and monthly energy consumption prediction using the IHEPC dataset with a deep learning-based approach.

**About**
It uses Individual Household Electric Power Consumption dataset which you can download from the link below:
https://archive.ics.uci.edu/dataset/235/individual+household+electric+power+consumption

**Process for training**
 This project uses the IHEPC (Individual Household Electric Power Consumption) dataset to predict energy consumption on an hourly, daily, weekly, and monthly basis. 
The first two years of data are used for training, while the last two years are reserved for testing. 
A Bidirectional LSTM (BLSTM) model is employed to capture temporal dependencies in consumption patterns. 
The implementation is done using NumPy, Pandas, Matplotlib, and Seaborn for data handling, model evaluation, and visualization.

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



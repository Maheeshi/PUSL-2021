import pickle
from sklearn.ensemble import RandomForestClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
import numpy as np

data_dict = pickle.load(open('./data.pickle', 'rb'))

# Check the shape of each element in the data array
max_length = max(len(item) for item in data_dict['data'])

# Pad sequences to the maximum length
padded_data = np.array([np.pad(item, (0, max_length - len(item)), 'constant') for item in data_dict['data']])

labels = np.asarray(data_dict['labels'])

x_train, x_test, y_train, y_test = train_test_split(padded_data, labels, test_size=0.2, shuffle=True, stratify=labels)

model = RandomForestClassifier()
model.fit(x_train, y_train)

y_predict = model.predict(x_test)

score = accuracy_score(y_predict, y_test)

print('Accuracy: {:.2f}% of samples were classified correctly!'.format(score * 100))

# Use 'with' statement for file handling
with open('model.p', 'wb') as f:
    pickle.dump({'model': model}, f, protocol=pickle.HIGHEST_PROTOCOL)
